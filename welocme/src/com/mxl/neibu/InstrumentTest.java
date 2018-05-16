package com.mxl.neibu;

public class InstrumentTest {
	public void playInstrument(Instrument is){
		is.play();
	}
	
	//成员内部类  实现接口
	class Inner implements Instrument{
		public void play() {
			System.out.println("我是成员内部类");
		}
	}
	
	
	
	//局部内部类
	public Instrument print(){
		//实现接口
		class Inner implements Instrument{
			public void play() {
				System.out.println("我是局部内部类");
			}
		}
		return new Inner();
	}
	
	
	
	public static void main(String[] args) {
		InstrumentTest is =new InstrumentTest();
		is.playInstrument(new InstrumentTest().new Inner());
		is.playInstrument(is.print());
		
		//匿名内部类  
		is.playInstrument(new Instrument() {
			public void play() {
				System.out.println("匿名内部类");
			}
		});
	}
}

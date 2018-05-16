package com.mxl.neibu;

public class InstrumentTest {
	public void playInstrument(Instrument is){
		is.play();
	}
	
	//��Ա�ڲ���  ʵ�ֽӿ�
	class Inner implements Instrument{
		public void play() {
			System.out.println("���ǳ�Ա�ڲ���");
		}
	}
	
	
	
	//�ֲ��ڲ���
	public Instrument print(){
		//ʵ�ֽӿ�
		class Inner implements Instrument{
			public void play() {
				System.out.println("���Ǿֲ��ڲ���");
			}
		}
		return new Inner();
	}
	
	
	
	public static void main(String[] args) {
		InstrumentTest is =new InstrumentTest();
		is.playInstrument(new InstrumentTest().new Inner());
		is.playInstrument(is.print());
		
		//�����ڲ���  
		is.playInstrument(new Instrument() {
			public void play() {
				System.out.println("�����ڲ���");
			}
		});
	}
}

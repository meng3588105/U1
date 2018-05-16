package com.OO.jiekou;
/**
 * 狗狗类
 * @author Administrator
 *
 */
public class Gogg extends Pet implements Eatable,FlyingDiscCatchable{
	
	public Gogg(String name,int health,int love){
		super(name);
	}
	
	

	public Gogg(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void catchingGlyDisc() {
		System.out.println(super.getName()+"正在玩接飞盘\n");
		
		
	}

	@Override
	public void eat() {
		System.out.println("狗狗正在吃饭");
		// TODO Auto-generated method stub
		
	}
	
}

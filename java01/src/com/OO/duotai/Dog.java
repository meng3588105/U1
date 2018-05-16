package com.OO.duotai;

public class Dog extends Pet{
	/**
	 * 狗狗类，宠物的子类
	 */
	private String strain;//品种
	public Dog(String name,String strain){
		super(name);
		this.strain=strain;
	}
	/**
	 * 重写父类的print（）方法
	 */
	public void print(){
		super.print();
		System.out.println("我是一只："+this.strain+"。");
	}
	/**
	 * 实现狗狗吃饭方法
	 */
	
	@Override
	public void eat() {
		super.health=super.health+3;
		System.out.println("狗狗"+super.name+"吃饱了，健康值增加3");
		// TODO Auto-generated method stub
		
	}
	
}

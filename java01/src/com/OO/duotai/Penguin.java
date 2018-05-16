package com.OO.duotai;

public  class Penguin extends Pet{
	private String sex;//性别
	
	
	/**
	 * 企鹅类，宠物的子类
	 */

	public Penguin(String name,String sex) {
		super(name);
		this.sex=sex;
	}
	/**
	 *重写父类的peint（）方法
	 */
	public void print(){
		super.print();
		System.out.println("性别是："+this.sex);
	}
	/**
	 * 实现企鹅吃饭的方法
	 */
	
	@Override
	public void eat() {
		super.health=super.health+5;
		System.err.println("企鹅"+super.name+"吃饱了！健康值增加5。");
		
	}

	
}

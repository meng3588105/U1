package com.OO.duotai;

public class Cat extends Pet{
	private String color;
	/**
	 * 猫类,宠物的子类
	 */
	public Cat(String name,String color){
		super(name);
		this.color=color;
	}
	/**
	 * 实现吃饭的方法
	 */
	public void eat(){
		super.health=super.health+4;
		System.out.println("猫咪"+super.name+"吃饱了！健康值增加4");
	}
	 
}

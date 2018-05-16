package com.OO.duotai;

public abstract class Pet {
	/**
	 * 宠物类，狗狗和企鹅的父类
	 */
	protected String name = "无名氏";//名字
	protected int health = 100;//健康值
	protected int love = 0;//亲密度
	
	public Pet(String name){
	this.name=name;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}		
	/**
	 * 输出宠物信息
	 */
	public void print(){
		System.out.println("宠物的自白：\n我的名字叫"+this.name+",健康值是"+this.health+",和主人的亲密度是"+this.love+"。");
	}
	/**
	 * 抽象方法get（），负责宠物吃饭功能
	 */
	public abstract void eat();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


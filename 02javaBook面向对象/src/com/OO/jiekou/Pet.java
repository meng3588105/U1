package com.OO.jiekou;

public abstract class Pet implements Eatable,FlyingDiscCatchable{
	private String name="无名氏";//宠物姓名
	private int health=100;//宠物健康值
	private int love = 0;//亲密度
	
	public Pet(){
		
	}

	public Pet(String name) {
		this.name = name;
	}
	public Pet(String name,int health,int love){
		this.name = name;
		this.health = health;
		this.love = love;
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

	public void print(){
		System.out.println("我是企鹅：\n我的名字叫"+this.name+",健康值是"+this.health+",和主人的亲密度是"+this.love+"。");
	}

	//public void eat() {
		// TODO Auto-generated method stub
		
	//}

	public void swim() {
		// TODO Auto-generated method stub
		
	}
}

package com.OO.duotai;

public class Master {
	private String name="";//主人名字
	private int money=0;//元宝数
	public Master(String name,int money){
		this.name=name;
		this.money=money;
	}
	/**
	 * 主人给宠物喂食
	 */
	public void feed(Pet pet){
		pet.eat();
	}
	/**
	 * 主人给Gog喂食
	 */
	public void feed(Dog dog){
		dog.eat();
	}
	/**
	 * 主人给penguin喂食
	 */
	public void feed(Penguin pgn){
		pgn.eat();
	}
	public Pet getPet(int typeId){
		Pet pet= null;
		if (typeId==1) {
			pet = new Dog("欧欧","雪纳瑞");
			
		}else if (typeId==2) {
			pet = new Penguin("楠楠","Q妹");
		}
		return pet;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

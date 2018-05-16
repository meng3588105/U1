package com.OO.jiekou;

public class Penguin extends Pet implements Eatable,Swimmable{

	public Penguin(String name,int health,int love){
		super(name,health,love);
		
	}
	public Penguin() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {//游泳
		System.out.println("企鹅正在游泳");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void catchingGlyDisc() {
		// TODO Auto-generated method stub
		
	}

}

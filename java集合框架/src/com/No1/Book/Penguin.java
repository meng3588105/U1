package com.No1.Book;

public class Penguin extends Pet{

	public Penguin(){
		
	}
	public Penguin(String name,int health,int love){
		super(name,health,love);
	}
	
	
	@Override
	public void print() {
		System.out.println("昵称为："+getName()+"\t健康值："+getHealth()+"\t亲密度："+getLove());
		
	}
	
}

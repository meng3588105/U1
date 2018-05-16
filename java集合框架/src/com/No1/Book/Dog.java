package com.No1.Book;
/**
 * 狗狗类
 */
public class Dog extends Pet{
	private String stain;

	public String getStain() {
		return stain;
	}
	public void setStain(String stain) {
		this.stain = stain;
	}
	public Dog(){

	}
	public Dog(String name,int health,int love,String stain){
		super(name,health,love);
		this.stain=stain;

	}
	public void print(){
		System.out.println("昵称为："+getName()+"\t健康值："+getHealth()+"\t亲密度："+getLove()+getStain());
	}
}

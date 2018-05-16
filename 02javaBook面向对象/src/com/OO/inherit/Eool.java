package com.OO.inherit;

public class Eool extends Cool{
	String bb="游泳";
	public Eool(String name,String varl,String like, String bb){
		super(name, varl, like);
		this.bb=bb;
	}
	public Eool(String name, String varl, String like) {
		super(name, varl, like);
				
	}

	
	public void shushu() {
		System.out.println("我叫："+this.getName()+",是一只"+this.getVarl()+"\n我喜欢吃:"+this.getLike()+"\n我会"+this.bb+"!");
		
		
	}
	
	
}

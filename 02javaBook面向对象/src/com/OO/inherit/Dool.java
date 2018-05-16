package com.OO.inherit;

public  class Dool extends Cool{
	 String aa="打鸣";
	public Dool(String name, String varl, String like, String aa) {
		super(name, varl, like);
		
		this.aa=aa;
		
	}
	public Dool(String name, String varl, String like) {
		super(name, varl, like);
				
	}

	public void shushu() {
		System.out.println("我叫："+this.getName()+",是一只"+this.getVarl()+"\n我喜欢吃"+this.getLike()+"\n我会"+this.aa+"!");
			
	}

	
	
}

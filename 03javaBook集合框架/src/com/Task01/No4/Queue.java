package com.Task01.No4;

public class Queue {
	private String name;

	public Queue(){
		
	}
	public Queue(String name){
		this.name=name;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void pintl(){
		System.out.println(this.getName());
	}
	
}

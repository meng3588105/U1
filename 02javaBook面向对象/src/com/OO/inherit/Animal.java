package com.OO.inherit;

public abstract class Animal {
	public abstract void info();
	
    public static void main(String[] args) {
        Animal bird = new Bird();
        bird.info();
         
        Animal fish = new Fish();
        fish.info();
	}
}

package com.OO.duotai;

public class WangXiaoQiang extends NiuBen{
	String chi = "四川菜";
	String wan = "太极拳";
	@Override
	public void print() {//重写牛犇的抽象方法，并且有两个值
		System.out.println("王小强喜欢吃"+this.chi+"练"+this.wan);
		
	}
	
}

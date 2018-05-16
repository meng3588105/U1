package com.OO.duotai;

public class YueHan extends NiuBen{
	String chi = "披萨";
	String wan = "橄榄球";
	@Override
	public void print() {//重写牛犇的抽象方法，并且有两个值
		System.out.println("约翰喜欢吃"+this.chi+"打"+this.wan);
		
	}
}

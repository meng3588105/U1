package com.OO.parameter;

public class ZuoYeB01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QuessMachine a = new QuessMachine();	//实例化类
		a.initial();		//实例化商品信息对象
		System.out.println("请猜测“"+a.commodity+"”价格");
		a.guess();			//实例化商品价格判断对象
		
		
		

	}

}

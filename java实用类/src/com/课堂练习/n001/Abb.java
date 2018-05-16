package com.课堂练习.n001;

import org.junit.Test;

public class Abb {
	@Test
	/**
	 * 经典的面试题
	 */
	public void test01(){
		int num1 = 127;
		int num2 = 127;
		System.out.println(num1==num2);
		
		Integer a = 127;
		Integer b = 127;
		System.out.println(a==b);
		
		Integer c = 128;
		Integer d = 128;
		System.out.println(c==d);
				
	}
	/**
	 * 所有包装类都有将对应的基本数据类型作为参数 老构造自己的实例
	 */
	@Test
	public void test02(){
		Byte b = new Byte((byte) 1);
		Short s = new Short((short) 1);
		Integer i = new Integer(1);
		Long l = new Long(1);
		Float f = new Float(1.0);
		Double d = new Double(5.2);
		
		Character c = new Character('1');
		Character c1 = new Character((char) 50);
		Boolean bo = new Boolean(true);
		
			
	}
	/**
	 * 除了Character 以外的7种包装类 都有将String 作为参数来构建自己的实例
	 * 6中数值类型的包装类都继承了Number
	 * 所有在用String 作为参数来创建自己实例的时候
	 * 如果参数不能转换成数值 则抛出NumberFormatException
	 */
	@Test
	public void test03(){
		Byte b = new Byte("1");
		Short s = new Short("1");
		Integer i = new Integer("1");
		Long l = new Long("1");
		Float f = new Float("1");
		Double d = new Double("1");
		
		//Character c = new Character("1");编译报错
		Boolean bo = new Boolean("TRUE");//除了大小写的true 返回true 其余全部是false
		System.out.println(bo);
		
	}
	/**
	 * 进制转换  需要学习 位运算
	 */
	@Test
	public void test04(){
		System.out.println("2进制的10对应的数据===》"+Integer.toBinaryString(10));
		System.out.println("8进制的10对应的数据===》"+Integer.toHexString(10));
		System.out.println("16进制的10对应的数据===》"+Integer.toOctalString(10));
	}
	/**
	 * valueOf
	 * 把基本数据类型转换成对应的包装类===》装箱
	 * 除了Character没有参数是String类型的方法
	 * 
	 * xxxValue   8中保证类型都有
	 * 把XXX类型转换成对应的基本数据类型===》拆箱
	 */
	@Test
	public void teat05(){
		int num = 5;
		Integer i = Integer.valueOf(num);//装箱
		num = i.intValue();//拆箱
		
	}
	@Test
	public void test(){
		System.out.println("1"+1+1);//111
		System.out.println(1+1+"1"+1);//211
	}
	
}

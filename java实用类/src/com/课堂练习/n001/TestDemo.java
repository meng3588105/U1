package com.课堂练习.n001;

import org.junit.Test;

public class TestDemo {
	@Test
	
	public void Tese01(){
		 String str1 = "hello";
		 String str2 = "HELLO";
		 System.out.println("变成大写："+str1.toUpperCase());
		 System.out.println("变成小写"+str2.toUpperCase());
		 System.out.println("字符串的长度："+str1.length());
		 System.out.println("hello.equals(hello)"+str1.equals(str2));
		 System.out.println("hello.equalsIgnoreCase(Hello)"+str1.equalsIgnoreCase(str2));
	}
	/**
	 * 字符串转换成char类型的数组
	 */
	@Test
	public void Test02(){
		String str1 = "h e l l o";
		char[]strs = str1.toCharArray();
		System.out.println(strs.length);//数组的长度
		for (char c : strs) {
			System.out.println(c);
		}
	}
	/**
	 * 字符串拆分 String regex 正则表达式
	 */
	@Test
	public void test03(){
		String str1 = "h1-e2-l3-l4-o5";
		String []strs = str1.split("-");
		for (String s : strs) {
			System.out.println(s);
		}
	}
	/**
	 * 查询指定字符的位置 下标从0开始
	 */
	@Test
	public void Test04(){
		String str1 = "123456@qq.com.cn";
		System.out.println("@出现的位置："+str1.indexOf("@"));
		System.out.println(".最后一次出现的位置："+str1.lastIndexOf("."));
		
	
	}
	/**
	 * 截取字符串  只想拿到qq.com
	 */
	@Test
	public void Test05(){
		String str1 = "123456@qq.com.cn";
		int begin = str1.indexOf("@");
		int end = str1.lastIndexOf(".");
		str1 = str1.substring(begin+1,end);//包含开始的位置,不包含结束的位置
		System.out.println(str1);
		
	}
	/**
	 * 替换字符串  把qq换成163
	 */
	@Test
	public void Test06(){
		String str1 = "123456@qq.com.cn";
		str1= str1.replace("qq", "163");
		System.out.println("str1");
	}
	/**
	 * 返回字符串中指定位置的字符
	 */
	@Test
	public void Test07(){
		String str1 = "123456@qq.com.cn";
		System.out.println(str1.charAt(6));
		
	}
	/**
	 * 了解字符串concat（String）
	 */
	@Test
	public void Test08(){
		System.out.println("1"+11+1);
		System.out.println(11+1+"1"+5.0+'a');
		String str1 = "a";
		String str2 = "bc";
		System.out.println(str1.contains(str2));

	}
	/**
	 * 判断某个字符串中是否包含另一个完整的字符串
	 */
	@Test
	public void Test09(){
		String str1 = "abcdefg";
		System.out.println(str1.contains("cde"));
		
	}
	/**
	 * String StringBuffer StringBuilder
	 * String str1 = "abcdefg";
	 * str1="abc";//每次都是以个新对象
	 * 
	 * 01.String对象不可变
	 * 02.StringBuffer StringBuilder对象可变
	 * 03.StringBuffer 线程安全 但是效率比StringBuilder低，适合于多线程的情况下使用
	 * 04.StringBuilder 线程不安全，但是效率是最高的！适合于单线程的情况下使用
	 * 
	 */
	@Test
	public void Test10(){
		//使用String
		String str1 = "hello";//定义一个变量
		int num=1000000;//定义操作字符串的次数
		//设置开始时间
		long begin = System.currentTimeMillis();
		for (int i = 0; i < num/100; i++) {
			str1+="bye";
		}
		//设置结束时间
		long end = System.currentTimeMillis();
		System.out.println("String操作1W次执行的时间是====》"+(end-begin));
		
		//使用StringBuffer
		str1="hello";
		StringBuffer sb = new StringBuffer(str1);
		//设置开始时间
		begin = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			sb.append("bye");
		}
		//设置结束时间
		end=System.currentTimeMillis();
		System.out.println("StringBuffer操作100w次执行的时间是====》"+(end-begin));
		
		//使用StringBuilder
		str1 = "hello";
		StringBuilder sb2 = new StringBuilder(str1);
		//设置开始时间
		begin = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			sb2.append("bye");		
		}
		
		//设置结束时间
		end = System.currentTimeMillis();
		System.out.println("StringBuilder操作100w次执行的时间是====》"+(end-begin));
	}
	
}

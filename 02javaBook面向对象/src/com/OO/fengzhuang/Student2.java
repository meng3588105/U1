package com.OO.fengzhuang;

public class Student2 {
	String name;//姓名
	int age;//年龄
	String sex="男";//性别
	String subject="java";//专业
	
	/**
	 * 第一种带参构造方式，除了性别sex，和专业subject，其余属性的值name和age都由测试类参数给定
	 * @param name
	 * @param age
	 */
	public Student2(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	/**
	 * 第二种带参构造方式，所有参数都由参数给定
	 * @param name
	 * @param age
	 * @param sex
	 * @param subject
	 */
	public Student2(String name,int age,String sex,String subject){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.subject=subject;
		
	}
	/**
	 * 在测试类里输出此句
	 */
	public void print(){
		System.out.println("自我介绍：\n姓名："+this.name+"\t年龄："
	+this.age+"\t性别："+this.sex+"\t专业："+this.subject+"\n");
	}
}

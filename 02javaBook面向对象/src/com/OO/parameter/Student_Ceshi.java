package com.OO.parameter;

public class Student_Ceshi {

	/**
	 * @param args
	 * new出student。赋值int型
	 * 
	 */
	public static void main(String[] args) {
		Student a = new Student(13,14,14);
		Student a1 = new Student(13,14,14);
		Student a2 = new Student(23,24,36);
		Student a3 = new Student(43,54,34);
		
		System.out.println("平均成绩是："+new StudentBiz().getAvg(a));
		System.out.println("平均成绩是："+new StudentBiz().getAvg(a1));
		System.out.println("平均成绩是："+new StudentBiz().getAvg(a2));
		System.out.println("平均成绩是："+new StudentBiz().getAvg(a3));

	}

}

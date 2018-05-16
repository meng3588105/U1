package com.variable;

import java.util.Scanner;

public class ZuoYe02 {


	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		System.out.println("年龄是：");
		int age=meng00.nextInt();//输入年龄
		
		System.out.println("性别是");
		String gender=meng00.next();//输入性别
		
		if (age>=7 || age>=5 && "男".equals(gender)){
			System.out.println("可以搬动桌子");//if判断是否年龄大于等于7，或者年龄大于等于5并且是男，就可以搬动桌子
		}	
	}

}

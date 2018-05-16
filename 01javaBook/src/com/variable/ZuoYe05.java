package com.variable;

import java.util.Scanner;

public class ZuoYe05 {


	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		System.out.println("考试成绩是：");
		int score =meng00.nextInt();
		if (score==100) {
			System.out.println("父亲给她买一辆车");//判断是否等于100
		}else if (score>=90) {
			System.out.println("母亲给她买一部笔记本电脑");//判断是否大于等于90
		}else if (score>=60) {
			System.out.println("母亲给她买一部手机");//判断是否大于等于60
		}else{
			System.out.println("没有礼物");//低于60没有礼物
		}

	}

}

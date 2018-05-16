package com.xunhuans;

import java.util.Scanner;



public class XunHuans01 {

	public static void main(String[] args) {
		int[]score = new int[4]; //成绩数组
		double sum = 0.0;		//成绩总和
		int classNum=3;//班级个数
		double average = 0.0;		//平均成绩
		//循环输入学员成绩
		Scanner meng00=new Scanner(System.in);
		for (int j = 1; j <= classNum; j++) {	//	循环班级次数
			
			for (int i = 0; i < score.length; i++) {				//循环一个班级中4名学生成绩
				System.out.println("请输入第"+(i+1)+"名学生的成绩");
				score[i]=meng00.nextInt();
				sum=sum+score[i];			//4名学生成绩总和
						
			}//for
			average=sum/score.length;						//平均分
			System.out.println("第"+j+"个班级的4名学生的平均分："+average);		
			//循环输出j个班级的平均分
		}
		
	}	

}

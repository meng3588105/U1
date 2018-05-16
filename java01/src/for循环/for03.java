package for循环;

import java.util.Scanner;

public class for03 {
	/**
	 * 案例1：循环输入某同学S1结业考试的5门课成绩，并计算平均分
	 * 分析；1）是否是固定次数for
	 *  	2)找循环条件
	 * */
	public static void main (String[]args){

		int cj;
		int he=0;
		double pj=0.0;
		
		Scanner haha=new Scanner(System.in);
		
		System.out.println("请输入姓名：");
		String name =haha.next();
		
		for(int i=0;i<5;i++){
			System.out.println("输入第"+(i+1)+"门课程");
			cj=haha.nextInt();
			he=he+cj;
			
		}
		pj=he/5;
		System.out.println("求5门课程的成绩平均分："+pj);
		
		
		
		
	}
	
	
}

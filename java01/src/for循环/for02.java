package for循环;

import java.util.Scanner;



public class for02 {

	public static void main(String[]args){
		
		int cj;		//每门课的成绩
		int he=0;	//成绩之和
		double pj = 0.0; //平均分
		Scanner input=new Scanner(System.in);
		System.out.println("输入学生姓名");
		String name=input.next();
		
		for(int i=0;i<5;i++){		//循环五次，录入五门课程的成绩
			System.out.println("请输入5门功课中第"+(i+1)+"门课的成绩");
			cj=input.nextInt();//录入成绩
			he=he+cj;//计算成绩和
		}
		pj=he/5;	//计算平均分
		System.out.println(name+"的平均分"+pj);
		
	}
	
	
	
}

package chapter_one;

import java.util.Scanner;

/**
 * 游人类
 * */
public class Visitor {
	String name;
	int age;
	//显示信息方法
	public void show(){
		Scanner input = new Scanner(System.in);
		while (!"n".equals(name)) {
			if (age>=18 && age<=60){
				System.out.println(name+"的年龄为"+age+"门票价格为：20元");
			}else {
				System.out.println(name+"的年龄为"+age+"门票价格为免费");
			}
				System.out.println("请输入姓名");
				name=input.next();
			if (!"n".equals(name)) {
				System.out.println("请输入年龄");
				age=input.nextInt();
				
			}
		}
		System.out.println("退出程序");
	}
	
	
	
}

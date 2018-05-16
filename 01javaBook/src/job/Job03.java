package job;

import java.util.Scanner;

public class Job03 {


	public static void main(String[] args) {
		System.out.println("\t\t\t欢迎使用我行我素购物管理系统");
		System.out.println("\t\t\t\t\t\t\t");
		Scanner meng000 =new Scanner(System.in);
		
		
		System.out.println("\t\t\t1.登录系统");
		System.out.println("\t\t\t\t\t\t\t");
		System.out.println("\t\t\t2.退出");
		System.out.println("***********************************************************");
		System.out.println("请选择，输入数字：");
		int q=meng000.nextInt();
		if(q==2){
			System.out.println("谢谢光临");
		}else{
		System.out.println("\t\t\t欢迎使用我行我素购物管理系统");
		System.out.println("***********************************************************");
		System.out.println("\t\t\t1.客户信息管理");
		System.out.println("\t\t\t\t\t\t\t");
		System.out.println("\t\t\t2.购物结算");
		System.out.println("\t\t\t\t\t\t\t");
		System.out.println("\t\t\t3.真情回馈");
		System.out.println("\t\t\t\t\t\t\t");
		System.out.println("\t\t\t4.注销");
		}
		
		
	}

}

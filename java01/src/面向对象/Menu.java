package 面向对象;

import java.util.Scanner;



public class Menu {
	public void showLofinMenu(){
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("1.登录系统");
		System.out.println("2.退出");
		System.out.println("*******************");
		System.out.println("请输入数字");
		
	}
	public void showMainMenu(){

	}	
	private void showCustMMenu(){
		
		
	}
	public void showSendGMenu(){
		boolean con;
		do {
			con= false;
			Scanner input = new Scanner(System.in);
			int no =input.nextInt();
			if (no==1) {
				System.out.println("执行幸运大放送");
			}else if (no==2) {
				System.out.println("执行幸运大抽奖");
			}else if (no==3) {
				System.out.println("执行生日问候");
			}else if (no==0) {
				showLoginMenu();
			}else {
				System.out.println("输入错误，请重新输入数字");
				con = true;
			}
		} while (con);
	}
	public void showLoginMenu(){
		boolean con;
		do {
			con= false;
			Scanner input = new Scanner(System.in);
			int no =input.nextInt();
			if (no==1) {
				showCustMMenu();
			}else if (no==2) {
				showSendGMenu();
			}else if (no==0) {
				showLoginMenu();
			}else {
				System.out.println("输入错误，请重新输入数字");
				con = true;
			}
		} while (con);
	}
	
	
}

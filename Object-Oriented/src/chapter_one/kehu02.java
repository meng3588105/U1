package chapter_one;

import java.util.Scanner;

public class kehu02 {

	public static void main(String[] args) {
		kehu01 a=new kehu01();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入您的会员");
		a.Goldvip=input.next();
		System.out.println("请输入您的积分");
		a.num=input.nextInt();
		a.hui=500;
		if (a.num>1000) {
			a.show();
		}else {
			a.aqq();
		}

	}

}

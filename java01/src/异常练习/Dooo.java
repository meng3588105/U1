package 异常练习;

import java.util.Scanner;

public class Dooo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("请输入一个数字");
			int a = input.nextInt();
			System.out.println("请输入一个数字");
			int b =input.nextInt();
			System.out.println("商是："+a/b);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
			e.printStackTrace();
		}
		
	}
}

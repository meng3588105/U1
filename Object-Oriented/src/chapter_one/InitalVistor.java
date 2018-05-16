package chapter_one;

import java.util.Scanner;

public class InitalVistor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Visitor aa =new Visitor();
		System.out.println("请输入姓名");
		aa.name=input.next();
		System.out.println("请输入年龄");
		aa.age=input.nextInt();
		aa.show();
	}

}

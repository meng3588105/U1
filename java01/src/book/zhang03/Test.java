package book.zhang03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎来到宠物店");
		//输入宠物名称
		System.out.println("输入你想要领养的宠物名字");
		String name = input.next();
		//选择宠物类型
		System.out.println("请选择要领养的宠物类型：1狗狗2企鹅");
		switch (input.nextInt()) {
		case 1:
			System.out.println("请选择狗狗的品种：1拉布拉多2雪纳瑞");
			String strain = null;
			if (input.nextInt()==1) {
				strain = "聪明的拉布拉多";
			}else {
				strain = "雪纳瑞";
			}
			//创建狗狗并且赋值
	/*		Dog dog = new Dog();
			dog.name=name;
			dog.statin = strain;
			//输出狗狗信息
			dog.print();
			break;*/
			
		case 2:
			System.out.println("请选择企鹅性别：1Q仔2Q妹");
			String sex=null;
			if (input.nextInt()==1) {
				sex="Q仔";
				
			}else {
				sex="Q妹";
				
			}
			//创建企鹅对象并赋值
			Penguin pgn =new Penguin();
			pgn.name=name;
			pgn.sex=sex;
			//输出企鹅信息
			pgn.print();
			break;

		}
	}
}

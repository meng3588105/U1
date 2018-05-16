package book.zhang03;

import java.util.Scanner;

public class Ddddd {
	
	int age;
	String name;
	Ddddd[]mm=new Ddddd[3];
	
	public void addDdddd(){
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < mm.length; i++) {
			System.out.println("请输入第"+(i+1)+"姓名");
			mm [i]=new Ddddd();
			mm [i].name = input.next();
			System.out.println("请输入第"+(i+1)+"年龄");
			mm [i].age= input.nextInt();
		}		
	}
	public void show(){
		for(Ddddd aa:mm){
			System.out.println("*************************");
			System.out.println(aa.name+"姓名"+aa.age+"年龄");
		}
	}
	public static void main(String[] args) {
		Ddddd a = new Ddddd();
		a.addDdddd();
		a.show();
	}
}

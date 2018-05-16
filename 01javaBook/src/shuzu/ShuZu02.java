package shuzu;

import java.util.Scanner;

public class ShuZu02 {
	public static void main(String[]args){
		int []list = new int [6];
		list[0] = 99;
		list[1] = 85;
		list[2] = 82;
		list[3] = 63;
		list[4] = 60;
		
		int index = list.length;
		System.out.println("请输入新增成绩：");
		Scanner meng00 = new Scanner(System.in);
		int num = meng00.nextInt();
		
		for (int i = 0; i < list.length; i++) {
			if (num > list[i]) {
				index = i;
				break;
				
			}
		}
		for (int j = list.length; j < list.length; j--) {
			list[j] = list[j-1];
			
		}
		list[index] = num;
		System.out.println("插入成绩的下标是："+index);
		System.out.println("插入后的成绩是：");
		for (int k = 0; k < list.length; k++) {
			System.out.println(list[k]+"\t");
		}
		
	}
}

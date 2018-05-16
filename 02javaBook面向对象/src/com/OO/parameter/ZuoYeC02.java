package com.OO.parameter;

import java.util.Scanner;

public class ZuoYeC02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		ZuoYeC01 a = new ZuoYeC01();
		int arr[]=new int [5];//数组原有值
		arr[0]=11;
		arr[1]=12;
		arr[2]=13;
		arr[3]=14;
		arr[4]=15;
		System.out.println("插入前的数组");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=0) {
				System.out.println(arr[i]+"");	//循环输出数组原有的值
			}
		}
		System.out.println("请输入要插入的位置");
		int index = input.nextInt();
		System.out.println("请输入要插入的整数");
		int value = input.nextInt();
		a.insertArray(arr, index, value);
		
				
				
	}

}

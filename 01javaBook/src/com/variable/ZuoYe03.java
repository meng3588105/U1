package com.variable;

import java.util.Scanner;
/**
 * 键盘输入三个整数，分别赋值a，b，c，然后将输入的整数按照从小到大的顺序放在变量a，b，c中，并输出三个变量。
 * 比较a，b，c，
 * 
 * 
 * */
public class ZuoYe03 {


	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		System.out.println("a是");
		int a= meng00.nextInt();
		System.out.println("b是");
		int b= meng00.nextInt();
		System.out.println("c是");
		int c= meng00.nextInt();		
		int d;

		if (a<b) {   //a如果小于b，进入if，判断b是否大于c，如果b大于c，则bc互换
			if (b>c) {
				d=c;
				c=b;
				b=d;
			}
				
			} 
		if (a>b) {//a如果大于b，进入if判断a是否大于c，a如果大于c，则ac互换
			 if (a>c) {
				d=a;
				a=c;
				c=d;
				}
			}
		if (a>b) {//a如果大于b,进入if。ab互换
			d=a;
			a=b;
			b=d;
					
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
}
		
		
}	
		
		



package com.variable;

import java.util.Scanner;

public class suanfa {
	public static void main(String[] args) {
		int d=0;
		Scanner meng00=new Scanner(System.in);
		System.out.println("a是");
		int a= meng00.nextInt();
		System.out.println("b是");
		int b= meng00.nextInt();
		System.out.println("c是");
		int c= meng00.nextInt();

		
		
		if(a>b){	//如果a大于b，ab互换
			d=a;
			a=b;
			b=d;
			if(b>c){	//如果b大于c  bc互换
				d=b;
				b=c;
				c=d;
				if(a>b){//最后再比较ab
					d=a;
					a=b;
					b=d;
				}
			}
			
		}else if(b>c){	 //如果不满足if的a>b，则判断是否b>c,
			d=b;
			b=c;
			c=d;
			if(a>b){		//如果else if 满足b>c,则执行判断a>b
				d=a;
				a=b;
				b=d;
			}
		}
		
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		
		
	}
}

package com.xunhuan;

public class ZuoYe02 {

	public static void main(String[] args) {		
		int a = 0;
		int b = 1 ;
		do {
			if (b%7==0) {//先判断b取余是不是没有余数，如果没有余数证明是7的倍数
				a=a+b;			//在算出另一个与7的倍数自加的数
			}b++;
		} while (b<50);		//b小于50
		System.out.println(a);
		
	}

}

package shuzu;

import java.util.Arrays;
import java.util.Scanner;

public class ZuoYe01 {

	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		String[]a=new String[5];
		System.out.println("请输入5句话：");
		for (int i = 0; i < a.length; i++) {
			System.out.println("第"+(i+1)+"句话：");
			a[i]=meng00.next();
		}
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[a.length-1-i]);
		}
	}

}

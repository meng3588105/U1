package com.mxl.SAY;

public class Test {
	public static void main(String[] args) {
		String str = "服微端云入加迎欢|welcome join us !";
		//截取字符串 “服微端云入加迎欢”
		String str2=str.substring(0,8);
		//截取字符串 “|welcome join us !”
		String str3=str.substring(8,26);
		String a="";
		//利用String类的toCharArray()存入数组
		char[]arr=str2.toCharArray();
		//循环倒序输出
		for (int i = arr.length-1;i >=0; i--) {
			a+=arr[i];
		}
		System.out.println(a+str3);
	}
}

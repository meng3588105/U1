package com.mxl.SAY;

public class Test {
	public static void main(String[] args) {
		String str = "��΢�������ӭ��|welcome join us !";
		//��ȡ�ַ��� ����΢�������ӭ����
		String str2=str.substring(0,8);
		//��ȡ�ַ��� ��|welcome join us !��
		String str3=str.substring(8,26);
		String a="";
		//����String���toCharArray()��������
		char[]arr=str2.toCharArray();
		//ѭ���������
		for (int i = arr.length-1;i >=0; i--) {
			a+=arr[i];
		}
		System.out.println(a+str3);
	}
}

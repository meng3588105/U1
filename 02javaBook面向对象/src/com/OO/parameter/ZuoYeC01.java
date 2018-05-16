package com.OO.parameter;

public class ZuoYeC01 {
	public void insertArray(int[]arr,int index,int value){	
		int xinarr[]=new int[arr.length+1];//定义一个新的数组
		for (int i = 0; i < arr.length; i++) {
			xinarr[i]=arr[i];
		}
		for (int i = xinarr.length-1; i <index ; i--) {
			xinarr[i]=xinarr[i-1];			//插入位置
		}
		xinarr[index]=value;
		System.out.println("插入后的数组");
		for (int i = 0; i < xinarr.length; i++) {	//输出插入后数组的值
			if (xinarr[i]!=0) {
				System.out.println(xinarr[i]+"");
			}
		}
		
	}
	
}

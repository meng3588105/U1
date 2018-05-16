package shuzu;

import java.util.Arrays;


public class ZuoYe04 {

	public static void main(String[] args) {
		int[]array=new int[]{1,3,-1,5,-2};			//定义一个长度为5的数组
		int[]newArray=new int[5];					//定义个新的数组
		
		for (int i = array.length-1; i >=0; i--) {		//if判断数组下标是不是小于0
			if (array[i]<0) {
				continue;
			}else {
				newArray[array.length-i-1] = array[i];//否则 array[i]数组  赋值给新的  数组【array.length-i-1】
			}
		}        System.out.println("原数组为：" 
					+ Arrays.toString(array));			//输出原数组  用 Arrays类的Arrays.toString(数组名)方法
        	System.out.println("逆序并处理后的数组为：" 
					+ Arrays.toString(newArray));		//输出逆序并处理后的数组  用 Arrays类的Arrays.toString(数组名)方法
        			

		}

	}




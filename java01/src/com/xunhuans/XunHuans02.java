package com.xunhuans;

public class XunHuans02 {
/**
 * 1)找行数  9行  。确定外层循环次数i=1 2 3 4 5 。。。9第九行
 * 2）找列数  确定内层循环次数 j   1个 2个 3个 4个 5个 。。。9个
 * 3）找关系  确定每行上的不同列数   j=1；j<=1;j++    
 * 4)找输出内容
 * 
 * */
	public static void main(String[] args) {
		for (int i = 0; i <=9; i++) {//行数
			for (int j = 1; j <=i; j++) {//列数
				System.out.print(j+"*"+i+"="+(j*i)+" ");
			}
			System.out.println();
		}
	}

}

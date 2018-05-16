package for循环;

import java.util.Scanner;

public class for04 {
	/**
	 * 使用for循环：输出加法表
	 * 1）循环初始化：i=0；j=输入值
	 * 2）循环条件：i<=输入值
	 * 3）循环操作：计算i+j
	 * 4）循环变量的改变：i++，j--
	 * 
	 * 例如：值为11
	 * 0+11=11
	*1+10=11
	*	2+9=11
	*	3+8=11
	*	4+7=11
	*	5+6=11
	 * 
	 * */
	
	
	
	
	
	public static void main(String[]args){
	
	int i,j;
	Scanner haha=new Scanner(System.in);
	System.out.println("输入一个值");
	int val=haha.nextInt();
	System.out.println("根据这个值输入以下加法表");
	
		for(i=0,j=val;i<=val;i++,j--){
			System.out.println(i+"+"+j+"="+(i+j));
			
		}
	
	}		
	
}

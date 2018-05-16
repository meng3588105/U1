package for循环;

import java.util.Scanner;

public class for05 {

	/**
	 * 循环初始化：i=0；j=输入值
	 * 循环条件：i<=输入值
	 * 循环操作：计算i+j
	 * 循环变量的改变：i++，j++
	 * 0+8
	 * 1+7=0
	 */
	
	public static void main(String[] args) {
		
		Scanner meng000=new Scanner(System.in);
		System.out.print("输入：");
		int j=meng000.nextInt();
		
				
		for(int i=0,a=j;i<=a;i++,j--){
			System.out.println(i+"+"+j+"="+(i+j));
			
		}
		
		
		
	}

}

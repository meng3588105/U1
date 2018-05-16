package shuzu;

import java.util.Scanner;

public class ZuoYe03 {

	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		int []nums=new int[10];//定义一个输入10个整数的数组
		int []count=new int[4];//定义一个4长度的数组
			System.out.println("请输入10个整数");
		for (int i = 0; i < nums.length; i++) {
			nums[i]=meng00.nextInt(); 				//循环输入10个整数
			switch (nums[i]) {
			case 1:
				count[0]++;							//输入数为1，在下标0自加
				break;
			case 2:
				count[1]++;							//输入数为2，在下标1自加
				break;
			case 3:
				count[2]++;							//输入数为3，在下标2自加
				break;			
			default:
				count[3]++;							//输入数为其他数，在下标3自加
				break;
			}
		}
		for (int j = 0; j < 3; j++) {				//for循环
			System.out.println("数字"+(j+1)+"的个数："+count[j]);	//i=0开始，循环3次个数
		}System.out.println("不合法的是："+count[3]);	//数组count,数字大于3的

		
	}

}

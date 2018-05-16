package number02;

import java.util.Scanner;

public class LianXi06 {


	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		System.out.println("华氏度是：");
		double f =meng00.nextDouble();//输入华氏度
		
		double s =5/9.0*(f-32); //转换摄氏度公式
		
		System.out.println("摄氏度是："+s);//输出摄氏度
		
		//System.out.printf("摄氏度是：%.2f",s);
	}

}

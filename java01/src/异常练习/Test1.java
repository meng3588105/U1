package 异常练习;

import java.util.Scanner;

public class Test1 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("请输入被除数");
		try {
						
			int num1 = input.nextInt();
			System.out.println("请输入除数");
			int num2= input.nextInt();
			System.out.println(String.format("%d/%d=%d", num1,num2,num1/num2));
			System.out.println("感谢使用本程序");
		} catch (Exception e) {
			System.err.println("出现错误：被除数和除数必须是整数，"+"除数不能为零");
			System.out.println(e.getMessage());
			System.exit(1);
		}finally{
			System.out.println("感谢使用本程序！");
		}
	}

}

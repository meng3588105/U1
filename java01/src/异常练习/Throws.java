package 异常练习;
/**
 * 使用throws抛出异常
 */
import java.util.Scanner;

public class Throws {

	/**
	 * 
	 * 通过try-catch捕获并处理异常
	 */
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			try {
				divide();
			} catch (Exception e) {
				System.out.println("出现错误：被除数和除数必须是整数，"+"除数不能为零");
				e.printStackTrace();
		}
	}
	/**
	 * 通过throws继续声明异常
	 */
	//public static void main(String[] args) throws Exception{
	//	divide();
	//}
/**
 * 输入被除数和除数，计算商并输出
 */
	public static void divide()throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("清输入被除数：");
		int num1 = input.nextInt();
		System.out.println("请输入除数：");
		int num2 = input.nextInt();
		System.out.println();
		System.out.println(String.format("%d/%d=%d", num1,num2,num1/num2));

	}
}

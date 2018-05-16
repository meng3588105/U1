package 异常练习;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class try_catch_too {
	private static Logger logger=Logger.getLogger(try_catch_too.class);

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
			
		}catch(InputMismatchException e){
			System.err.println("被除数和除数必须是整数。");
		}catch(ArithmeticException e){
			System.err.println("除数不能为零");
		}catch (Exception e) {
			System.err.println("其他未知异常");
		}finally{
			System.err.println("感谢使用本程序！");
		}
	}

}

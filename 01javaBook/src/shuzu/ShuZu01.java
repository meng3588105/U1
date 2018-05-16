package shuzu;
import java.util.Arrays;
import java.util.Scanner;
public class ShuZu01 {

	public static void main(String[] args) {
		System.out.println("请输入本月会员消费记录额");
	
		double[]scores=new double[5];   //
		double he=0;
		Scanner meng00=new Scanner(System.in);
		
		for (int i = 0; i < scores.length; i++) {
				
			System.out.println("请输入第"+(i+1)+"笔购物金额"); //for循环输入金额
			scores[i]=meng00.nextInt();
			he=he+scores[i];     //求和
		}
			System.out.println("序号\t\t金额(元)");
		for (int i = 0; i < scores.length; i++) { 		//输出数组循环
			System.out.println((1+i)+"\t\t"+scores[i]);
		}	
		System.out.println("总金额\t\t"+he);   //算出总金额
		
		Arrays.sort(scores);//排序类使用
		for (int i = 0; i < scores.length; i++) { 		
			System.out.println(""+scores[i]);
		}	
		
	}

}

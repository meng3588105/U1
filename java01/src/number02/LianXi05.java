package number02;

import java.util.Scanner;

public class LianXi05 {

	public static void main(String[] args) {
		Scanner meng00 =new Scanner(System.in);
		System.out.println("请输入本金：");//本金
		double benjin=meng00.nextDouble();
		System.out.println("本金为："+benjin);
		
		double one=benjin*2.25/100+benjin;//一年利率
		double two=benjin*2*2.7/100+benjin;//二年利率
		double three=benjin*3*3.24/100+benjin;//三年利率
		double five=benjin*5*3.6/100+benjin;//五年利率
		System.out.println("存取一年后的本息是："+one);//一年本息
		System.out.println("存取一年后的本息是："+two);//两年本息
		System.out.println("存取一年后的本息是："+three);//三年本息
		System.out.println("存取一年后的本息是："+five);//五年本息
		
		/*double onelixi=benjin*one;//一年利息
		double twolixi=benjin*(two*2);//两年利息
		double threelixi=benjin*(three*3);//三年利息
		double fivelixi=benjin*(five*5);//五年利息
		*/
		
		
		/*double onebenxi=benjin+onelixi;//一年本息
		System.out.println("存取一年后的本息是："+onebenxi);
		double twobenxi=benjin+twolixi;//两年本息
		System.out.println("存取两年后的本息是："+twobenxi);
		double threebenxi=benjin+threelixi;//三年本息
		System.out.println("存取三年后的本息是："+threebenxi);
		double fivebenxi=benjin+fivelixi;//五年本息
		System.out.println("存取五年后的本息是："+fivebenxi);
		*/
		
		
		
		
		

	}

}

package number02;

import java.util.Scanner;

public class LianXi12 {

	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		System.out.println("中奖了吗？");
		String cp=meng00.next();
		if (cp.equals("yes")) {
			System.out.println("中了500万，我买车，捐助希望工程，去欧洲旅游");
		}else {
			System.out.println("没中！我买下一期体彩，继续烧高香");
		}
		System.out.println("我的银行存款是多少？");	
		int ck = meng00.nextInt();
		if (ck==5000000) {	
			System.out.println("买一辆凯迪拉克");	
		}else if (ck>=1000000) {
			System.out.println("买一辆帕萨特");		
		}else if (ck>=500000) {
			System.out.println("买一辆伊兰特");	
		}else if (ck>=100000) {
			System.out.println("买一辆奥拓");	
		}else {
			System.out.println("买一辆捷安特");	
		}

	}

}

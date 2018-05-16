package number02;

import java.util.Scanner;

public class LianXi07 {

	public static void main(String[] args) {
		//产生一个随机数 0~9
		int suiji=(int)(Math.random()*10);
		
		//从控制台接收一个4位会员卡号
		System.out.println("我行我素购物管理系统>幸运抽奖");
		System.out.println("请输入4位会员号:");
		Scanner meng00=new Scanner(System.in);
		int hao=meng00.nextInt();
		
		//分解百位，求百位数是多少
		int baiwei=hao/100%10;
		System.out.println("百位"+baiwei);
		
		
		//判断百位数是否和随机数一样，一样则为if，否则else
		if(suiji==baiwei){
			System.out.println("恭喜你是幸运会员"+hao);
		}else{
			System.out.println("谢谢"+hao);
		}
		

	}

}

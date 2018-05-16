package number02;

import java.util.Scanner;

public class LianXi03 {
	public static void main(String[]args){
		Scanner huiyuan=new Scanner(System.in);
		
		System.out.println("请输入四位会员卡号：");
		
		int kh=huiyuan.nextInt();
		int gw=kh%10;	//求各位数字
		int sw=kh/10%10;    //求十位数字
		int bw=kh/100%10;	//求百位数字
		int qw=kh/1000%10;	//求千位数字

		
		

		
		int he=gw+sw+bw+qw;
		System.out.println("四位会员卡号之和为："+he);  //各个数字之和
		
		boolean qq=he>20;
		System.out.println("您是幸运顾客吗？"+qq);//判断是否是幸运顾客
}
}
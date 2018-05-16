package number02;

import java.util.Scanner;

public class LianXi08 {

	public static void main(String[] args) {
		System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息");
		Scanner meng00=new Scanner(System.in);
		
		System.out.println("请输入会员号<四位整数>");
		int custNO=meng00.nextInt();		//键盘输入四位整数
		
		//if判断是否是四位整数，正确继续走，else错误退出
		if(custNO>999 && custNO<=9999){
			
			System.out.println("请输入生日(月/日<用两位数字表示>)");
			int custBirth=meng00.nextInt();		//输入生日
			System.out.println("请输入积分");
			int custScore=meng00.nextInt();		//输入积分
			System.out.println("已录入的会员信息\n"+custNO+"\t"+custBirth+"\t"+custScore);//显示录入的会员信息
			
		}else{
			
			System.out.println("输入有误");//输入有误退出
			
		}
		
		
			
		
		

		
		

	}

}

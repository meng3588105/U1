package number02;

import java.util.Scanner;

public class LianXi10 {
	public static void main(String[]args){
		
			
		Scanner meng00= new Scanner(System.in);
			//输入金额
			System.out.println("请输入消费金额：");
			double money=meng00.nextDouble();
			System.out.println("是否参加优惠换购活动：\n1：满50元，加2元换购百事可乐一瓶");

			System.out.println("2:满100元，加3元换购500ml可乐一瓶");

			System.out.println("3:满100元，加10元换购5kg面粉");

			System.out.println("4:满200元，加10元可换购1个苏泊尔炒菜锅");
	
			System.out.println("5:满200元，加20元可换购欧莱雅爽肤水一瓶\n0：不换购");
			//选择项
			System.out.print("请选择：");
		if(meng00.hasNextInt()==true){ 		//判断输入是否为字符
			int xuanze =meng00.nextInt();
			switch(xuanze){			//输入的数字
			case 1:
				System.out.println("本次消费总金额"+(money+2)+"\n成功换购百事可乐饮料一瓶");
				break;
			case 2:
				System.out.println("本次消费总金额"+(money+3)+"\n成功换购500ml饮料一瓶");
				break;
			case 3:
				System.out.println("本次消费总金额"+(money+10)+"\n成功换购5kg面粉");
				break;
			case 4:
				System.out.println("本次消费总金额"+(money+10)+"\n成功换购一个苏泊尔炒菜锅");
				break;
			case 5:
				System.out.println("本次消费总金额"+(money+20)+"\n成功换购欧莱雅爽肤水一瓶");
				break;
			}
			
			
		}else{
			System.out.println("输入有误请重新输入");//输入非数字有误
		}

			
			
			
  }
	
}

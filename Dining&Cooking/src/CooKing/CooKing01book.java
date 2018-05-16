package CooKing;

import java.util.*;

public class CooKing01book {

	/**
	 * 吃货联盟订餐系统
	 */
	public static void main(String[] args) {
		String []names = new String[100];//保存订餐人姓名
		String []dishMegs = new String[100];//保存所选信息，包括菜品名及份数
		int []times = new int[100];//保存送餐时间
		String []addresses= new String[100];//保存送餐地址
		int[]states = new int[100];//保存订单状态：0表示已预订，1表示已完成
		double[]sumPrices = new double[100];//保存订单的总金额
		String[]dishNames={"红烧带鱼","鱼香肉丝","时令鲜蔬"};//菜品名称
		double[]prices= {38.0,20.0,10.0};			//菜品单价
		int[]praiseNums = new int[3];				//点赞数


		Scanner input = new Scanner(System.in);
		int num=-1;//用户输入0返回主菜单，否则退出系统
		boolean isExit= false;//标志用户是否退出系统：true为退出系统

		System.out.println("欢迎使用“吃货联盟订餐系统”");
		//循环：显示菜单，根据用户选择的数字执行相应的功能
		do {
			//显示菜单
			System.out.println("********************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐带");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("********************");
			System.out.println("请选择：");
			int choose = input.nextInt();//记录用户选择功能编号

			//根据用户输入的功能编号，执行相应功能
			switch (choose) {
			case 1://我要订餐
				System.out.println("***我要订餐***");
				System.out.println("请输入订餐人姓名：");
				String name1=input.next();
				//显示供选择的菜品信息
				System.out.println("序号"+"\t"+"菜名"+"\t"+"单价"+"\t"+"点赞数");
				for (int i = 0; i < 3; i++) {
					String price = prices[i]+"元";
					String priaiseNum= (praiseNums[i])>0?praiseNums[i]+"赞":"0";
					System.out.println((i+1)+"\t"+dishNames[i]+"\t"+prices[i]+"\t"+praiseNums[i]);
				}
				System.out.println("请选择您要的菜品编号:");
				int chooseDish=input.nextInt();
				System.out.println("请选择您要的份数");
				int number=input.nextInt();
				String dishMeg= dishNames[chooseDish-1]+""+number+"份";
				double sumPrice = prices[chooseDish-1]*number;
				System.out.println("请输入送餐时间(送餐时间是10点至20点间整点送餐)：");
				int time = input.nextInt();
				while (time<10||time>20) {
					System.out.println("您的输入有误，请输入10~20间的整数！");
					int shu=input.nextInt();
				}
				System.out.println("请输入送餐地址：");
				String address=input.next();
				//无需添加状态，默认是0，既已预定状态
				System.out.println("订餐成功");
				System.out.println("您定的是:"+dishMeg);
				System.out.println("送餐时间："+time);
				String deliChargs="0";
				System.out.println("餐费："+sumPrice+"元,送餐费"+deliChargs+"元,总计："+(sumPrice+deliChargs)+"元");

				break;	

			case 2:	//查看餐带		
				System.out.println("***查看餐带***");
				System.out.println("序号\t订餐人\t餐品信息\t\t送餐日期\t送餐地址\t\t总金额\t订单状态");
				for (int i = 0; i < names.length; i++) {
					if (names[i]!=null) {
						String state = (states[i]==0)?"已预订":"已完成";
						String date = times[i]+"日";

						System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]+"\t"+date
								+"\t"+addresses[i]+"\t"+state);
					}
				}
				break;

			case 3:
				System.out.println("***签收订单***");break;
			case 4:
				System.out.println("***删除订单***");break;
			case 5:
				System.out.println("***我要点赞***");break;
			case 6:
				isExit = true; break;
			default:
				isExit=true;break;
			}
			if (!isExit) {
				System.out.println("输入0返回");
				num = input.nextInt();
			}else {
				break;
			}
		} while (num==0);
	}

}
/*
 * 				boolean isAdd = false;//记录是**我要订餐***否可以订餐
				for (int j = 0; j < names.length; j++) {
					if (names[j]==null) {//找到第一个空位置，可以添加订单信息
						isAdd=true;			//置标志位，可以订餐
						System.out.println("请输入订餐人姓名：");
						String name=input.next();
						//显示供选择的菜品信息
						System.out.println("序号"+"\t"+"菜名"+"\t"+"单价"\t"+"点赞数");
						for (int i = 0; i < dishNames.length; i++) {"+
							String price = prices[i]+"元";
							String priaiseNum = (praiseNums[i])>0?praiseNums[i]+"赞":"0";\
							System.out.println((i+1)+dishNames+);



		//初始化第一条订单信息
		names[0]="张晴";
		dishMegs[0]= "红烧带鱼2份";
		times[0]=12;
		addresses[0]="天成路207号";
		sumPrices[0]= 76.0;
		states[0]=1;
		//初始化第二条订单信息
		names[1]="张晴";
		dishMegs[1]="鱼香肉丝两份";
		times[1]=18;
		addresses[1]="天成路107号";
		sumPrices[1]=45.0;
		states[1]=0;
 */

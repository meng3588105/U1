package CooKing;

import java.util.*;

public class CooKing001 {

	/**
	 * 吃货联盟
	 */
	public static void main(String[] args) {
		String []names = new String[100];//保存订餐人姓名
		String []dishMegs = new String[100];//保存所选信息，包括菜品名及份数
		int []times = new int[100];//保存送餐时间
		String []addresses= new String[100];//保存送餐地址
		int[]states = new int[100];//保存订单状态：0表示已预订，1表示已完成
		double[]sumPrices = new double[100];//保存订单的总金额
		Scanner input=new Scanner(System.in);
		String [] dishNames= {"炭烤母猪蹄","大肠刺身","酥炸小黄瓜","麻辣鱼鳞"};
		double[]prices= new double[]{38.0,20.0,10.0,15.0};
		int[]praiseNums = new int[100];
		int num=-1;//用户输入0返回主菜单，否则退出系统
		boolean isExit= false;//标志用户是否退出系统：true为退出系统
		//初始化餐带信息
		names[0]="韩东";
		dishMegs[0]="炭烤母猪蹄2份";
		times[0]=12;
		addresses[0]="天成路207号";
		sumPrices[0]=45;
		states[0]=0;		
		names[1]="苑阳阳";
		dishMegs[1]="酥炸小黄瓜2份";
		times[1]=12;
		addresses[1]="天成路207号";
		sumPrices[1]=45;
		states[1]=0;				
		do {
			//显示菜单
			System.out.println("欢迎使用“吃货联盟订餐系统”");
			System.out.println("********************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐带");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("********************");
			System.out.println("请选择：");
			int xuanze = input.nextInt();//记录用户选择功能编号
			switch (xuanze) {
			case 1:		
				for (int q = 0; q < names.length; q++) { //循环录入数组订餐
					if (names[q]==null) {				//判断各个数组中的得出的订餐值为null
						System.out.println("***我要订餐***");
						System.out.println("请输入订餐人姓名：");
						String name=input.next();
						System.out.println("序号\t菜名\t单价\t点赞数");				
						for (int i = 0; i < dishNames.length; i++) {		//循环输出订购详情		
							System.out.println((i+1)+"\t"+dishNames[i]+"\t"+prices[i]+"\t"+praiseNums[i]);				
						}
						System.out.println("请选择您要点的菜品编号：");
						int chooseDish = input.nextInt();
						System.out.println("请选择您需要的份数：");
						int number = input.nextInt();
						System.out.println("请输入送餐时间（送餐时间是10点至20点间整点送餐）");
						int time = input.nextInt();
						while (time<10||time>20) {
							System.out.println("您的输入有误，请输入10-20之间的整数");
							time= input.nextInt();
						}			
						double sumPrice = prices[chooseDish - 1] * number;
						double price = (sumPrice > 60) ? 0 : 3;
						System.out.println("请输入送餐地址：");
						String address=input.next();
						System.out.println("订餐成功！");
						System.out.println("您订的是:"+dishNames[chooseDish-1]+number+"份");
						System.out.println("送餐时间是："+time+"点");
						System.out.println("餐费："+prices[chooseDish-1] * number+"元"+"送餐费："+price+"元");
						System.out.println("总金额："+(prices[chooseDish-1] * number+price));
						//向数组中添加数据
						names[q] =name;//保存订餐人姓名
						dishMegs[q] =dishNames[chooseDish-1];//保存所选信息，包括菜品名及份数
						times[q] =time;//保存送餐时间
						addresses[q]=address;//保存送餐地址
						states[q] =0;//保存订单状态：0表示已预订，1表示已完成
						sumPrices[q] =(prices[chooseDish-1] * number+price);//保存订单的总金额
						break;
					}
				}
				;break;
			case 2:	//查看餐带
				System.out.println("***查看餐带***");
				System.out.println("序号\t订餐人\t餐品信息\t\t送餐日期\t送餐地址\t\t总金额\t订单状态");
				for (int i = 0; i < praiseNums.length; i++) {
					if (names[i]!=null) {		//取消显示空值
						System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]+"\t"+times[i]+"点\t"
								+addresses[i]+"\t\t"+sumPrices[i]+"\t"+states[i]);
					}
				}
				break;
			case 3://签收订单	
				System.out.println("***签收订单***");
				boolean isSignFind = false;//找到要签收的订单
				System.out.println("青选择要签收的订单序号：");
				int signOrderId = input.nextInt();
				for (int i = 0; i < names.length; i++) {
					//状态为 已预订，序号为用户输入的订单序号减1：可签收
					//状态为 已完成，序号为用户输入的订单序号减1：不可签收
					if (names[i]!=null && states[i]==0 && signOrderId==i+1) {
						states[i]=1;//将状态值置为已完成
						System.out.println("订单签收成功！");
						isSignFind = true;//标记已找到此订单
					}else if (names[i]!=null && states[i]==1 && signOrderId==i+1) {
						System.out.println("您选择的订单已完成签收，不能再次签收");
						isSignFind=true;	//标记已找到此订单
					}
				}
				//未找到的订单序号：不可签收
				if (!isSignFind) {
					System.out.println("您选择的订单不存在");
				}
				break;
			case 4:
				//删除订单
				System.out.println("***删除订单***");
				boolean isDelFind = false;//标记是否找到要删除的订单
				System.out.println("请输入要删除的订单序号");
				int delId = input.nextInt();
				for (int i = 0; i <names.length; i++) {
					//状态为 已完成，序号为用户输入的订单序号减1：可删除
					//状态为 已预定，序号为用户输入的订单序号减1：不可删除
					if (names[i]!=null && states[i]==1 && delId==i+1) {
						isDelFind = true;//标记已找到此订单
						//执行删除操作：删除位置后的元素依次前移
						for (int j = delId-1; j < names.length-1; j++) {
							names[j]=names[i+1];
							dishMegs[j]=dishMegs[j+1];
							times[j]=times[j+1];
							addresses[j]=addresses[j+1];
							states[j]=states[j+1];
							sumPrices[j]=sumPrices[j+1];							
						}
						//最后一位清空
						int endIndex=names.length-1;
						names[endIndex] = null;
						dishMegs[endIndex]=null;
						times[endIndex]=0;
						addresses[endIndex]=null;
						states[endIndex]=0;
						sumPrices[endIndex]=0;
					}else if (names[i]!=null && states[i]==0 && delId==i+1) {
						System.out.println("您选择的订单为签收，不能删除");
						isDelFind=true;
						break;
					}
				}
				//未找到该序号的订单：不能删除
				if (!isDelFind) {
					System.out.println("您要删除的订单不存在");					
				}
				break;
			case 5:
				//我要点赞
				System.out.println("***我要点赞***");
				//显示菜品信息
				System.out.println("序号\t菜名\t单价\t点赞数");
				for (int i = 0; i < dishNames.length; i++) {
					String price = prices[i]+"元";
					String zan="";
					System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price+"\t"+zan);
				}
				System.out.println("请选择您要点赞的菜品序号");
				int zan = input.nextInt();
				praiseNums[zan-1]++;//赞数加1
				System.out.println("点赞成功");
				break;
			case 6:	System.out.println("***退出系统***");break;
			default:
				break;				
			}			
			if (!isExit) {
				System.out.println("*********输入0返回***********");
				num = input.nextInt();
			}else {
				break;
			}
		} while (num==0);
	}
}
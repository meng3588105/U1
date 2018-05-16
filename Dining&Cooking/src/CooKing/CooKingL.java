package CooKing;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class CooKingL {
	/**
	 * @param args
	 * @throws ParseException 
	 */
	@SuppressWarnings("unused")//忽略黄色感叹号警告
	public static void main(String[] args) throws ParseException {
		String[] names = new String[100]; // 订餐人姓名
		String[] dishMsgs = new String[100];// 选择菜品
		int[] numbers = new int[100];// 菜品份数
		Date[] dates = new Date[100]; // 送餐时间
		String[] times = new String[100]; // 送餐时间对应的String类型的日期
		String[] addresses = new String[100];// 送餐地址
		int[] states = new int[100];// 订单状态 0:已经预定 1：已经完成
		double[] sumPrices = new double[100];// 总金额
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");//时间那个
		// 初始化数据
		names[0] = "韩冬";
		dishMsgs[0] = "清蒸猪头2份";
		numbers[0] = 3;
		dates[0] = new Date();

		times[0] = sdf.format(dates[0]);
		addresses[0] = "傻逼路2B号";
		states[0] = 1;
		sumPrices[0] = 5000;

		names[1] = "苑阳阳";
		dishMsgs[1] = "红烧狗头2份";
		numbers[1] = 5;
		dates[1] = new Date();
		times[1] = sdf.format(dates[1]);
		addresses[1] = "傻逼路2B号";
		states[1] = 1;
		sumPrices[1] = 500;

		// 初始化用户可以选择的菜
		String[] dishNames = { "红烧胖大海", "炭烤母猪蹄", "酒酿萝卜皮", "大肠刺身", "酥炸小黄瓜", "麻辣鱼鳞" };
		// 定义每个菜的单价
		double[] prices = { 19, 29.9, 39.9, 49.9, 59.9, 69.9 };
		// 定义点赞 的数组
		int[] praiseNums = new int[6];
		praiseNums[0] = 5;
		praiseNums[1] = 10;

		System.out.println("***********欢迎进入《吃货联盟》点餐系统***********");
		Scanner input = new Scanner(System.in);
		int num = -1; // 如果用户输入的是0 默认返回主菜单
		boolean isExit = false;// 定义一个标记 来标识 用户是否退出系统 true:退出
		do {
			// 显示菜单供用户选择
			System.out.println("当前系统时间是：" + sdf.format(new Date()));
			System.out.println("1:我要订餐");
			System.out.println("2:查看餐袋");
			System.out.println("3:签收订单");
			System.out.println("4:删除订单");
			System.out.println("5:我要点赞");
			System.out.println("6:退出系统");
			System.out.println("**********************");
			System.out.println("请选择：");
			int choose = input.nextInt(); // 根据用户的选择执行不同的功能
			switch (choose) {
			case 1:
				System.out.println("************我要订餐************");
				// 定义一个标记判断餐带是否已满
				boolean addFlag = false;
				for (int i = 0; i < names.length; i++) { // 订餐人的集合
					if (names[i] == null) {
						addFlag = true;
						System.out.println("请输入订餐人的姓名：");
						names[i] = input.next(); // 获取订餐人的姓名
						System.out.println("您可以选择下列的菜品：");
						System.out.println("序号\t\t\t菜名\t\t\t单价\t\t\t点赞数");
						for (int j = 0; j < dishNames.length; j++) { // 遍历菜品
							String praiseNum = (praiseNums[j] > 0) ? praiseNums[j]
									+ "个赞"
									: "";
							System.out.println(j + 1 + "\t\t\t" + dishNames[j]
									+ "\t\t\t" + prices[j] + "\t\t\t"
									+ praiseNum);
						}
						// 用户开始点菜
						System.out.println("请您选择菜品的编号：");
						int chooseDishName = input.nextInt();
						System.out.println("请您输入点餐的份数：");
						int number = input.nextInt();
						System.out.println("请您输入送餐的地址：");
						String address = input.next();
						System.out.println("请您输入送餐的时间：（时：分：秒）");
						String time = input.next();
						double sumPrice = prices[chooseDishName - 1] * number;//根据用户的餐费 判断是否收取送餐费   大于60免送餐费 
						double price = (sumPrice > 60) ? 0 : 6;
						System.out.println("恭喜您订餐成功！");
						System.out.println("您定的菜品是："
								+ dishNames[chooseDishName - 1] + "\t" + number
								+ "份");
						System.out.print("餐费：" + sumPrice);
						System.out.print("\t送餐费：" + price);
						System.out.println("\t总费用：" + (price + sumPrice));
						// 向数组中增加数据
						times[i] = sdf.format(sdf.parse(time)); // 时间
						addresses[i] = address; // 地址
						sumPrices[i] = (sumPrice + price); // 总金额
						dishMsgs[i] = dishNames[chooseDishName - 1]; // 定的菜品
						states[i] = 0; // 订餐的状态
						numbers[i] = number; // 份数
						break;
					}
				}
				if (!addFlag) {// 餐袋已经满了
					System.out.println("餐袋已经满了");
				}
				break;
			case 2:
				System.out.println("************查看餐袋************");
				System.out.println("编号\t\t订餐人\t\t菜品(份数)\t\t送餐时间 \t\t送餐地址\t\t总金额\t\t状态\t\t点赞数量");
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) { // 有人订餐 的显示
						String state = (states[i] == 0) ? "已经预定" : "已经完成"; // 获取状态
						String time = times[i]; // 获取时间
						String sumPrice = sumPrices[i] + "元"; // 总金额
						String address = addresses[i]; // 地址
						String dishMsg = dishMsgs[i]; // 菜品
						int count = numbers[i];
						System.out.println(i + 1 + "\t\t" + names[i] + "\t\t"
								+ dishMsg + "(" + count + ")" + "\t\t" + time
								+ " \t\t" + address + "\t\t" + sumPrice
								+ "\t\t" + state + "\t\t" + praiseNums[i]);
					}
				}break;           
			case 3:
				System.out.println("************签收订单************");
				System.out.println("请您输入需要签收的订单编号：");//01.状态为已经完成！不需要签收02.状态为已经预定！需要签收03.没有指定的订单，不能签收
				int sign = input.nextInt();
				// 定义一个标记 来判断订单是否被签收
				int flag = 0;
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null && states[i] == 0) {// 01.有订单 可以签收
						states[i] = 1;// 改变状态
						flag = 1;
						break; // 必须退出 否则 后续的都会变成签收
					} else if (names[i] != null && states[i] == 1) {// 02.有订单
						flag = 2;
					}
				}
				if (flag == 1) {
					System.out.println("订单已经签收！");
				} else if (flag == 2) {
					System.out.println("订单不需要重复签收！");
				} else {
					System.out.println("没有指定的订单！请您核实！");
				}
				break;
			case 4:
				System.out.println("************删除订单************");
				System.out.println("请您输入需要删除的订单编号：");
				int delNum = input.nextInt();
				// 定义一个标记 来判断订单是否被签收以及是否存在
				int delFlag = 0;
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null && states[delNum - 1] == 1) { // 可以删除                                                                        // 有指定的订单
						// 状态是已经完成
						// 删除位置 之后的所有元素 依次前移
						for (int j = delNum - 1; j < names.length - 1; j++) {
							names[j] = names[j + 1]; // 订餐人
							dishMsgs[j] = dishMsgs[j + 1];// 菜品
							times[j] = times[j + 1];// 时间
							addresses[j] = addresses[j + 1];// 地址
							states[j] = states[j + 1];// 状态
							numbers[j] = numbers[j + 1];// 份数
						}
						delFlag = 1;
						break;
					} else if (names[i] != null && states[i] == 0) { // 订单还没有签收
						delFlag = 2;
					}
				}
				if (delFlag == 1) {
					System.out.println("订单已经被删除");
				} else if (delFlag == 2) {
					System.out.println("订单还没有签收 不允许删除！");
				} else {
					System.out.println("没有找到指定的订单！");
				}
				break;
			case 5:
				System.out.println("************我要点赞***************");
				System.out.println("编号\t\t\t菜名\t\t\t价格");
				for (int i = 0; i < dishNames.length; i++) { // 遍历所有的菜名
					String price = prices[i] + "元"; // 获取价格
					String name = dishNames[i];
					System.out.println(i + 1 + "\t\t\t" + name + "\t\t\t"
							+ price);
				}
				System.out.println("请您输入点赞的菜品编号：");
				int chooseNum = input.nextInt();
				praiseNums[chooseNum - 1]++;// 点赞数加+1
				System.out.println("谢谢参与！点赞成功！");
				break;
			default:
				// 输入其他数字退出系统
				isExit = true;
				break;
			}
			if (!isExit) { // 默认这是不退出
				System.out.println("输入0返回主菜单！");
				num = input.nextInt();
			} else {
				break; // 退出系统
			}
		} while (num == 0);
		System.out.println("谢谢您的光临！！！！！");
	}
}
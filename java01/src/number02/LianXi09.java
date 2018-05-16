package number02;

import java.util.Scanner;

public final class LianXi09 {


	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		System.out.println("请输入会员积分");//输入积分
		int jifen=meng00.nextInt();
		
		//if判断
		if(jifen<2000){								//积分小于2000
			System.out.println("该会员享受0.9折扣");	
		}
		if(2000<=jifen && jifen<4000){				//积分大于等于2000，并且积分小于4000
			System.out.println("该会员享受0.8折扣");
		}else if(4000<=jifen && jifen<8000){		//积分大于等于4000，并且积分小于8000
			System.out.println("该会员享受0.7折扣");
		}else if(jifen>=8000){						//积分大于等于8000
			System.out.println("该会员享受0.6折扣");
		}

	}

}

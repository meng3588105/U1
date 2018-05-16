package number02;

public class LianXi02 {

	public static void main(String[] args) {
		
		System.out.println("＊＊＊＊＊＊＊*消费单*＊＊＊＊＊＊＊＊＊");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T恤\t￥245\t￥2个\t￥490");
		System.out.println("网球鞋\t￥570\t￥1个\t￥570");
		System.out.println("网球拍\t￥320\t￥1个\t￥320\n");
		
		
		int tixuprice=245;//体恤衫价格
		int qiuxieprice=570;//网球鞋价格
		int qiupaiprice=320;//球拍价格
		
		int tixugs=2;//体恤个数
		int qiuxiegs=1;//球鞋个数
		int qiupaigs=1;//球拍个数
		
		double zhekou=0.8;//折扣8折
		
		double zong=(tixuprice*tixugs+qiuxieprice*qiuxiegs+qiupaiprice*qiupaigs)*zhekou;
		System.out.println("消费总金额\t￥"+zong);//计算总金额
		
		int shiji=1500;
		System.out.println("实际交费\t￥"+shiji);//实际交费
		
		double zhaoqian=(double)shiji-zong;
		System.out.println("找钱\t￥"+zhaoqian);//找钱金额
		
		int jifen=(int)zong*3/100;
		System.out.println("本次购物所获得积分是:"+jifen);//获得积分
		
		//计算积分
		
	
		
	}

}

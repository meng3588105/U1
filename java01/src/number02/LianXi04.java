package number02;

public class LianXi04 {

	public static void main(String[] args) {
		System.out.println("输出互换前手中的纸牌：");
		
		int a=10; //左手10
		int b=8;//右手8
		int c;//中间变量
		System.out.println("左手中的纸牌："+a);
		System.out.println("右手中的纸牌："+b);
		
		c=a;//a赋值给c
		a=b;//b赋值给a
		b=c;//c赋值给b
		System.out.println("\n输出互换后手中的纸牌：");
		System.out.println("左手中的纸牌："+a);
		System.out.println("右手中的纸牌："+b);
		
		
		
		
		

	}

}

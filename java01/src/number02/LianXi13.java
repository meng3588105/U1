package number02;

import java.util.Scanner;

public class LianXi13 {

	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		System.out.println("张浩的java成绩");
		int javacj=meng00.nextInt();
		System.out.println("张浩的音乐成绩");
		int yycj=meng00. nextInt();
		
		if ((javacj>98 && yycj > 80 )||( javacj==100 && yycj>70)) {
			System.out.println("老师会奖励他");
		}
	}

}

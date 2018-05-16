package shuzu;

import java.util.Scanner;

public class ShuZu04 {

	public static void main(String[] args) {
		int[]scores=new int[5];
		Scanner meng00=new Scanner(System.in);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("输入第个"+(i+1)+"成绩");
			scores[0]=meng00.nextInt();
		}
		int max=scores[0];
		for (int i = 0; i < scores.length; i++) {
			if (scores[i]>max) {
				max=scores[i];
				
			}
		}System.out.println("最大"+max);
	}

}

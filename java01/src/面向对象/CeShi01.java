package 面向对象;

import java.util.Scanner;

public class CeShi01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentsBiz a = new StudentsBiz();
		int []scores = new int[5];//保存比赛成绩
		Scanner input = new Scanner(System.in);
		System.out.println("请输入五名参赛者的成绩：");
		for (int i = 0; i < scores.length; i++) {
			scores[i]=input.nextInt();
		}
		//输出平均成绩
		double avgScore = a.calAvg(scores);
		System.out.println("平均成绩："+avgScore);
		//输出最高成绩
		int maxScore = a.calMax(scores);
		System.out.println("最高成绩："+maxScore);
	}
}



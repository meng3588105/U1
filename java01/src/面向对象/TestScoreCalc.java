package 面向对象;

import java.util.Scanner;

import org.apache.log4j.Logger;



public class TestScoreCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logger log = Logger.getLogger(TestScoreCalc.class);
		ScoreCalc a = new ScoreCalc();
		Scanner input = new Scanner(System.in);
		System.out.print("请输入java成绩：");
		a.java= input.nextInt();
		System.out.print("请输入c#成绩：");
		a.c= input.nextInt();
		System.out.print("请输入db成绩：");
		a.db=  input.nextInt();
		//测试总成绩
		a.showTotalScore();
		//测试平均分
		a.showAvg();
	}

}

package 面向对象;

public class ScoreCalc {
	int java;
	int c;
	int db;
	//计算总成绩
	public int calcTotalScore(){
		int total = java+c+db;
		return total;
	}
	//显示总成绩
	public void showTotalScore(){
		System.out.println("总成绩是："+calcTotalScore());
	}
	//计算平均成绩
	public double calcAvg(){
		double avg = (java+c+db)/3.0;
		return avg;
	}
	public void showAvg(){
		System.out.println("平均成绩是："+calcAvg());
	}
	
	
}

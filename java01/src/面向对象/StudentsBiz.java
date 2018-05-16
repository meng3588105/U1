package 面向对象;

public class StudentsBiz {
	/**
	 * 求平均分
	 * @return
	 * @param scores 参赛成绩数组
	 */
	public double calAvg(int[]scores){
		int sum= 0;
		double avg =0.0;
		for (int i = 0; i < scores.length; i++) {
			sum+=scores[i];
		}
		avg= (double)sum/scores.length;
		return avg;
	}
	/**
	 * 求最高分
	 * @param scores 参赛成绩数组
	 * 
	 */
	public int calMax(int []scores){
		int max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (max<scores[i]) {
				max = scores[i];
			}
		}
		return max;
	}
	
}

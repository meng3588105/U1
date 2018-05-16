package shuzu;

public class ZuoYe02 {

	public static void main(String[] args) {
		int points[]=new int[]{18,25,7,36,13,2,89,63};
		int min=0;//最小值
		int index=0;//最低积分的下标
		min=points[0];//下标变量
		for (int i = 0; i < points.length; i++) {
			if (points[i]<min) {		//for循环比较。最小的值，
				min=points[i];			//把数组最小数 赋值给min最小值变量中
				index=i;				//数组下标i 赋值给index
			}
		}System.out.println("数组中最小的数是："+min);	//数组中最小的数
		points[index]=min;		
		System.out.println("数组中最小数的原始下标是"+index);//数组中最小数的下标原始位置
	}

}

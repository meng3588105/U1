package com.xunhuan;

public class ZuoYe003 {


	public static void main(String[] args) {

		for (int i = 1; i<=100; i++) {	//进入for循环，（i=1 i<=100）从1开始到100结束
			if (i%3==0&&i%5==0) {			//if判断 i取余3没有余数的，并且i取余5没有余数进入if，输出是3和5的倍数
				System.out.println("FilpFlop");
			}else if (i%3==0) {				//不满足if 进入else if，i取余3==0，输出3的倍数
				System.out.println("Filp");
			}else if (i%5==0) {				//不满足if 不满足 else if ，进入下一个else if，i取余5==0，输出5的倍数
				System.out.println("Folp");
			}else {							//否则其他数 输出i
				System.out.println(i);
			}
			
		}
	}

}

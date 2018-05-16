package com.OO.parameter;

public class StudentBiz {

	/**
	 * 算平均分 用 参数stu点出来
	 * @param args
	 */
	public double getAvg(Student stu){
		
		return stu.cj=(stu.c+stu.java+stu.SQL)/3.0;
		
							
	}

}

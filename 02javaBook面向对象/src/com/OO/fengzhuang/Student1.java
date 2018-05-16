package com.OO.fengzhuang;
/**
 * 
 * @author 学员类
 *
 */
	
public class Student1 {
	private  String name="龙";//姓名
	private  int sex=16;//年龄
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	/**
	 * 在set里判断年龄的大小
	 * @param sex
	 */
	public void setSex(int sex) {
		this.sex = sex;
		if (this.sex<=16) {			
			
			System.out.println("输出错误");
			
		}else {
			this.sex=sex;
		}
	}
	/**
	 * 输出格式测试类调用print方法
	 */
	public void print(){
		System.out.print("我的名字叫："+this.name+"\n我的年龄是:"+this.sex);
	}
	
}

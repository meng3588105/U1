package chapter_one;
/**
 * 学生类：类就是一个抽象的模板
 * */
public class Student {
	//属性 成员变量
	String name;//姓名
	int age;//年龄
	String classNo;//班级
	String hobby;//爱好
	int shuzi;
	
	//方法  行为 动作
	public void show(){
		System.out.println("姓名为："+name+"\t年龄为："+age+"\t所在班级："+classNo+"\t爱好："+hobby+shuzi);
	}
}

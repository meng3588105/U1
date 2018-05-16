package 内部类练习;
import 内部类练习.Father.Son;
import 内部类练习.Father.Son2;

public class InnerClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 使用成员内部类
		 * 01、实例化外部类对象
		 * 02、通过外部类对象创建内部类对象
		 * 03、调用被不累的属性和方法
		 */
		Father father = new Father();
		//Son son = father.new Son();
		//访问成员内部类
		//son.sayHello();
		//访问局部内部类
		//father.getSon();
		//访问静态内部类
		
		//Son2 son2=new Son2();
		Son2.sayHello();

	}

}

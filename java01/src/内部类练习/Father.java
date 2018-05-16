package 内部类练习;
/**
 * 外部类必须是public修饰，不能更改访问权限修饰符
 * 内部类可以设置 访问权限修饰符
 * 
 * 如果我们把Son单独提取成一个类
 * 这样任何地方都可以访问Son！
 * 现在把Son变成了内部类！
 * 别人必须想访问Father，才能拿到Son
 */
public class Father {//外部类
	/**
	 * 外部类成员变量
	 */
	private static int age = 50;
	private String name = "小白";
	/**
	 * 定义成员内部类
	 */
	class Son {
		int age = 100;
		String name = "小黑";
		
		public void sayHello(){
			System.out.println("Son 成员内部类打招呼的方法！");
			System.out.println("内部类age==》"+age);
			System.out.println("内部类name==》"+name);
			System.out.println("获取外部类的属性");
			System.out.println("外部类age===》"+Father.this.age);
			System.out.println("外部类name===》"+Father.this.name);			
		}
		
	}
	public void getSon(){
		class Son{//局部内部类仅限于方法里面
			public void sayHello(){
				System.out.println("Son 局部内部类打招呼的方法");
			}
		}
		Son son = new Son();
		son.sayHello();
	}
	/**
	 * 静态内部类
	 */
	static class Son2{
		public static void sayHello(){
			System.out.println("Son2 静态内部类打招呼的方法！"+age);
		}
	}
	
	
}

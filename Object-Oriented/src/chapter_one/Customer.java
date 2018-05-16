package chapter_one;

public class Customer {
	public static void main(String[] args) {
		administrator admi1=new administrator();
		administrator admi2=new administrator();
		//给管理员对象1赋值并调用显示方法
		admi1.name="孟祥龙";
		admi1.mima="1111";
		admi1.show();
		//给管理员对象2赋值并调用显示方法
		admi2.name="孟祥";
		admi2.mima="1234";
		admi2.show();
		
	}
}

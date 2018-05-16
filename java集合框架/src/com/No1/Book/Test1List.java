package com.No1.Book;
import java.util.ArrayList;
import java.util.List;
public class Test1List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog dog1 = new Dog("兰兰",100,90,"拉布拉");
		Dog dog2 = new Dog("楠楠",60,50,"雪纳瑞");
		Dog dog3 = new Dog("娜娜",90,30,"松狮");
		Dog dog4 = new Dog("妮妮",80,100,"可比克");
		Dog dog5 = new Dog("哈哈",80,100,"可比克");
		//声明集合
		List lis = new ArrayList();
		//添加操作
		lis.add(dog1);//0    Dog类型》object
		lis.add(dog2);//1
		lis.add(dog3);//2
		lis.add(dog4);//3
		lis.add(0,dog5);//将dog5对象添加到了集合的索引号为0的位置，其余的索引号重新排列，依次向后顺移。
		//for循环遍历集合，
		//		size()返回列表中的元素个数，有元素的集合长度！！！！！！
		for (int i = 0; i < lis.size(); i++) {
			Object obj = lis.get(i);//object--》Dog拆箱
			Dog dogs= (Dog)obj;
			dogs.print();
		}
		//删除方式
		//lis.remove(3);//删除索引号为0的对象

		lis.remove(dog4);//按照指定的对象名删除

		System.out.println("*****************");

		//利用for增强循环，遍历集合
		for (Object obj : lis) {
			((Dog)obj).print();
		}
		//判断列表中是否有此元素if
		if (lis.contains(3)) {
			System.out.println("*****妮妮存在");
		}else {
			System.out.println("******妮妮不存在");
		}

		System.out.println("***********企鹅信息****************");
		Penguin uin1= new Penguin("丽丽",100,100);
		Penguin uin2= new Penguin("碰碰",100,100);
		Penguin uin3= new Penguin("国国",100,100);
		Penguin uin4= new Penguin("呃呃",100,100);
		Penguin uin5= new Penguin("比比",100,100);
		Penguin uin6= new Penguin("啊啊",100,100);
		Penguin uin7= new Penguin("松狮",100,100);
		Penguin uin8= new Penguin("问问",100,100);


		//创建一个Arraylist集合，存储企鹅信息
		List uins = new ArrayList();
		uins.add(uin1);
		uins.add(uin2);
		uins.add(uin3);
		uins.add(uin4);
		uins.add(uin5);
		uins.add(uin6);
		uins.add(uin7);
		

		//用增强for遍历集合
		/*for (Object ob : uins) {
			((Penguin)ob).print();
		}*/
		//用普通for遍历集合
		for (int i = 0; i < uins.size(); i++) {
			Object ob = uins.get(i);
			Penguin uin = (Penguin)ob;		//需要将Object 强制转换成Penguin这个方法
			uin.print();
		}
		//删除集合其中的一个元素
		uins.remove(uin2);
		System.out.println("****************删除其中一个元素***************");
		for (Object object : uins) {
			((Penguin)object).print();//增强for循环也是一样，object要强制转换成Penguin这个方法
		}
		if (uins.contains(uin3)) {
			System.out.println("dd");
		}else {
			System.out.println("ss");
		}




	}

}

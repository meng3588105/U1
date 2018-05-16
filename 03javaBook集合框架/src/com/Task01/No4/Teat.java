package com.Task01.No4;

import java.util.LinkedList;

public class Teat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue ue1 = new Queue("老一");
		Queue ue2 = new Queue("老二");
		Queue ue3 = new Queue("老三");
		Queue ue4 = new Queue("老四");
		Queue ue5 = new Queue("机器人1号");
		
		LinkedList ueue = new LinkedList();
		
		ueue.add(ue1);
		ueue.add(ue2);
		ueue.add(ue3);
		ueue.add(ue4);
		
		for (int i = 0; i < ueue.size(); i++) {
			Queue ueues = (Queue)ueue.get(i);
			System.out.println(ueues.getName()+"");
		}
		System.out.println("*********向LinkedList添加*********");
		/**
		 * 向列表中第一个元素添加机器人1号
		 */
		ueue.addFirst(ue5);//向列表中第一个位置添加一个元素
		for (int i = 0; i < ueue.size(); i++) {
			Queue ueues = (Queue)ueue.get(i);
			System.out.println(ueues.getName()+"");
		}
		System.out.println("***********向LinkedList列表中取出最后一个元素**************");
		ueue.removeLast();//向列表中最后一个位置删除一个元素
		
		for (Object obj : ueue) {
			((Queue)obj).pintl();
		
		}
	}

}

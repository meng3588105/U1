package com.ShangJi.No2;

public class Register {
	public boolean show(String id, String phone, String number) {
		boolean flag = false;

		String stu1 = number.substring(4,5);
		if ((id.length() == 16 || id.length() == 18 )&& (number.length() == 12
				&& stu1.equals("-") )&& phone.length() == 11) {

			System.out.println("注册成功！！");

			flag = false;
		}

		return flag;
	}

}

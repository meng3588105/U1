package com.ShangJi.No1;
public class Register {
	public boolean verify(String name, String pwd1, String pwd2) {
		boolean flag = false;
		if (name.length() > 3 && pwd1.length() > 6 && pwd1.equals(pwd2)) {
			System.out.println("注册成功请牢记密码");
			flag=false;
		}
		return flag;

	}
}

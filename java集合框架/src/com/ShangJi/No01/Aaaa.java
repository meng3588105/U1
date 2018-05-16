package com.ShangJi.No01;

public class Aaaa {


	public boolean verify (String name,String mi,String mi2){
		boolean flag =false;
		if (name.length() > 3 && mi.length() > 6&&mi.equals(mi2)) {
			
			flag= true;
			System.out.println("注册成功");
		}
		return flag;
		
	}

}




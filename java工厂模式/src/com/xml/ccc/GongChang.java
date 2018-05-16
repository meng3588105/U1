package com.xml.ccc;

public class GongChang {
	public static opp getOperate(String yun) {
		opp pp = null;
		switch (yun) {
		case "+":
			pp = new Jia();
			break;
		case "-":
			pp = new Jian();
			break;
		case "*":
			pp = new Cheng();
			break;
		case "/":
			pp = new Chu();
			break;

		}
		return pp;
	}
}

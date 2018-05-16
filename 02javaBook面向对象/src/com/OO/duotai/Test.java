package com.OO.duotai;

public class Test {

	/**
	 * 测试类
	 * @param args
	 */
	public static void main(String[] args) {
		Printer dot = new DotMatrixPrinter();//输出针式打印机类
		dot.print();
		Printer lnk = new LnkpetPrinter();//输出喷墨打印机类
		lnk.print();
		Printer las = new LaserPrinter();//输出激光打印机类
		las.print();
	}

}

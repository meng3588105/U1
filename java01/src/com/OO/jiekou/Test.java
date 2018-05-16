/**
 * 
 */
package com.OO.jiekou;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 * 测试类
	 */
	public static void main(String[] args) {
		Usbinterface uDisk = new UDisk();
		uDisk.service();
		Usbinterface usbFan = new UsbFan();
		usbFan.service();

	}

}

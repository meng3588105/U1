/**
 * 
 */
package com.OO.jiekou;

/**
 * @author Administrator
 *
 */
public class UsbFan implements Usbinterface{

	@Override
	public void service() {
		System.out.println("链接usb接口，获得电流，风扇开始转动");
		
	}

}

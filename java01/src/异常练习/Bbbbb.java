package 异常练习;

import java.util.Scanner;

import org.apache.log4j.Logger;



public class Bbbbb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logger log = Logger.getLogger(Bbbbb.class);
		log.fatal("fatal   msg");
		log.error("error   msg");
		log.warn("warn   msg");
		log.info("info   msg");
		log.debug("debug   msg");
		log.trace("trace   msg");
		Scanner input = new Scanner(System.in);
	
		System.out.println("请输入账号");
		String name=input.next();
		System.out.println("请输入密码");
		String mi = input.next();
		log.trace(name);
		log.trace(mi);


	}

}

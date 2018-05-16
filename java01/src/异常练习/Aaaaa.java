package 异常练习;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Aaaaa {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		String name = "龙";
		String mi = "123";

		Scanner input = new Scanner(System.in);
		Logger log = Logger.getLogger(Aaaaa.class);
		System.out.println("请输入账号");
		name = input.next();
		System.out.println("请输入密码");
		mi = input.next();
		if (name.equals(name) && mi.equals(mi)) {
			log.trace("登录成功");
			log.trace("用户名" + name);
			log.trace("密码" + mi);

		} else {
			log.trace("登录失败");
			log.trace("用户名" + name);
			log.trace("密码" + mi);

		}

	}

}

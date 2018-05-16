package 异常练习;

public class Demo {

	public static void asss()throws Exception{
		throw new ArrayIndexOutOfBoundsException("异常1");
	}
	public static void main(String[] args) throws Exception{
		asss();
	}
}

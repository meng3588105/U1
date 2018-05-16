package Enum;

public enum EnumDemo {

	/**
	 * @param args
	 */
	
	MAN("男"),WOMEN("女");//构造
	
	private String sex;
	private EnumDemo(String sex){
		this.sex = sex;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}


}

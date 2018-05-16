package book.zhang03;

public class Dog {
	private String name = "无名氏";
	private int health = 100;
	private int love = 0 ;
	private String statin = "聪明的拉布拉多";
	
	
	/**
	 * 输出狗狗信息
	 * 
	 */
	public void print(){
		System.out.println("宠物的自白：\n我的名字叫"+this.name+
				",健康值是"+this.health+",和主人亲密度是"+this.love+
				",我是一只"+this.statin+"。");
	}
}

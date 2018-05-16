package book.zhang03;

public class Penguin {
	String name = "无名氏";
	int health = 100;
	int love = 0 ;
	String sex = "Q仔";
	/**
	 * 无参构造方法
	 */
	public Penguin(){
		name="楠楠";
		love= 20 ;
		sex = "Q妹";
		System.out.println("执行构造方法");
	}
	/**
	 * 两个带参的构造方法
	 */
	public Penguin(String name,String sex){
		this.name=name;
		this.sex=sex;
		
	}
	/**
	 * 四个带参的构造方法
	 */
	public Penguin(String name,int health,int love,String sex){
		this.name=name;
		this.health=health;
		this.love=love;
		this.sex=sex;
	}
	/**
	 * 输出企鹅信息
	 * 
	 */
	public void print(){
		System.out.println("宠物的自白：\n我的名字叫"+this.name+
				",健康值是"+this.health+",和主人亲密度是"+this.love+
				",性"+this.sex+"。");
	}
	/**
	 * 测试无参构造方法的使用
	 */
	public static void main(String[] args) {
		Penguin pgn = null;
		pgn =new Penguin();
		pgn.print();
		pgn =new Penguin("丫丫","企鹅");
		pgn.print();
		pgn= new Penguin("美美",80,20,"Q仔");
		pgn.print();
				
				
	}
}

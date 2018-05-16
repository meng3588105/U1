package book04lianxi;

public abstract  class Pet {
	public String name;
	public int health=100;
	public int love=45;
	public void print(){
		
	}
	/**
	 * 无参构造方法
	 */
	public Pet(){
		
	}
	/**
	 * 有参构造方法
	 * @param name
	 * @param health
	 * @param love
	 */
	public Pet(String name){
		this.name=name;


	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		
		this.love=love;
	}
	public void shuchu(){}
	
		
	
		
	
}

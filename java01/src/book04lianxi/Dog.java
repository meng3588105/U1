package book04lianxi;

public class Dog extends Pet{
	
	private String strain;
	
	public Dog(String name ,String strain){
		super(name);
		this.strain=strain;
	}
	public String getStrain(){
		return strain;
	}

	public void shuchu(){
		super.shuchu();
		this.setLove(12);
		this.setName("哈哈");
		this.setHealth(34);
		
		System.out.println("狗子类修改负累,我的名字叫："+this.getName()+",我的健康值是"+this.getHealth()+",我和主人的亲密度是："+this.getLove()+"***"+this.strain);
	}
	
}

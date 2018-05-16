package book04lianxi;

public class Penguin extends Pet{
	private String sex;
	
	public Penguin(String name,String sex){
		super(name);
		this.sex=sex;
		
	}
	public String getSex(){
		return sex;		
	}
	
	public void shuchu(){
		super.shuchu();
		System.out.println("企鹅性别："+this.sex);
		
	}
}

package book04lianxi;

public class Aaa {
	private String name;
	private String age;
	private String ji;
	
	public Aaa()
	{
		
	}
	public Aaa(String name,String age,String ji){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getJi() {
		return ji;
	}
	public void setJi(String ji) {
		this.ji = ji;
	}
	public void trt(){
		
		System.out.println("12");
	}
	
	@Override
	public String toString() {
		return "Aaa [name=" + name + ", age=" + age + ", ji=" + ji + "]";
	}
	public static void main(String[] args) {
		Aaa a = new Aaa();
		a.setAge("aa");
		a.setJi("bb");
		a.setName("cc");
		System.out.println(a);
		a.trt();
		
	}

	
	
}

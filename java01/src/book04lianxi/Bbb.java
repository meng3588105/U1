package book04lianxi;

public class Bbb extends Aaa{
	public  Bbb(){
		
	}
	public  Bbb(String name,String age,String ji){
		super(name,age,ji);
	}
	@Override
	public void trt(){
		super.trt();
		System.out.println("我人类");
	}
}

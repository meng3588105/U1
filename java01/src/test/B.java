package test;

public class B extends A {
	
	
	public void out(){
		
		super.out();
		
		this.aa=90;
		this.bb="BB";
		
		System.out.println(this.aa+this.bb);
		
		super.out();
		
		
	}

}

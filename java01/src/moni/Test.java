package moni;

public class Test {
	public static void main(String[] args) {
		MoNi Mo1 = new MoNi(30,350,"赵恒文");
		MoNi Mo2 = new MoNi(10,750,"苑阳阳");
		Thread t1 = new Thread(Mo1);
		Thread t2 = new Thread(Mo2);
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		
	}
}
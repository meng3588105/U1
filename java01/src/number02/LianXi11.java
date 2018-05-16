package number02;

public class LianXi11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int year= 2046;
		if (!(year%2==0)) {
			if (year/10==0) {
				System.out.println("1");
			}
		}else{
			System.out.println("2");
		}
		System.out.println("3");
	}

}

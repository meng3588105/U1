package number02;

public class LianXi14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0,i;
		for (i = 1; i <= 4 ; i++) {
			switch (i) {
			case 1:
				sum=sum+2;
				
				break;
			case 2:
				sum=sum+4;
				
				continue;
			case 3:
				sum=sum+16;
				System.out.println(sum);
				break;
				
			}
		}

	}

}

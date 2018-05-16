package moni;

public class MoNi implements Runnable {
	int num;// 定义叫号数量
	int time;// 定义时间
	String name;// 类型名字

	public MoNi(int num, int time, String name) {
		this.name = name;
		this.num = num;
		this.time = time;
	}

	@Override
	public void run() {
		for (int i = 1; i <= this.num; i++) {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.name+i+"号病人正在看病");
			
			if (this.name.equals("赵恒文") && i == 10) {
				try {
					Thread.currentThread().join(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}

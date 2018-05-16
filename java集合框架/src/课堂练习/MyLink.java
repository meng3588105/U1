package 课堂练习;

public class MyLink {// 存储链表的值
	private int data;
	private MyLink next;// 指针指向下一个数据

	public MyLink(int i) { // 创建带参构造
	data = i;
	}

	// 向链表中增加值
	public void add(MyLink link) {
	link.next = next;
	next = link;

	}

	private void append(MyLink myLink) {
	MyLink x = this;
	while (x.next != null) {
	x = x.next;
	}
	x.next = myLink;

	}

	private void show() {
	MyLink x = this;
	while (x != null) {
	System.out.println(x.data);
	x = x.next;
	}

	}

	public static void main(String[] args) {
	MyLink link = new MyLink(1);
	link.append(new MyLink(10));// 拼接
	link.append(new MyLink(20));// 拼接
	link.append(new MyLink(50));// 拼接
	link.add(new MyLink(6)); // 新增
	link.show();

	}


}

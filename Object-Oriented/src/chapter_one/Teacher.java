package chapter_one;
/**
 * 教员类
 * 
 * */
public class Teacher {
	String tname;
	String major;//专业方向
	String course;//教授课程
	int schoolAge;//教龄
	
	public void teacherShow(int s,int s1){
		int aa = s*s1;
		
		System.out.println(aa+"教员姓名"+tname+"\t专业为："+major+"\t教授课程"+course+"\t教龄"+schoolAge);
	}
}

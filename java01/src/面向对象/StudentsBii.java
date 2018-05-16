package 面向对象;

/**
 * 学生管理类
 * @author Administrator
 *
 */
public class StudentsBii {
	Student[]students = new Student[30];//学生数组
	/**
	 * 增加学生
	 * @param 一个学生
	 */
	public void addStudent(Student stu){
		for(int i = 0; i < students.length; i++) {
			if (students[i]==null) {
				students[i]=stu;
				break;
			}
		}	
	}
	/**
	 * 显示本班的学生信息
	 */
	public void showStudents(){
		System.out.println("本班学生列表：");
		for (int i = 0; i < students.length; i++) {
			if (students[i]!=null) {
				students[i].showInfo();
			}
		}
		System.out.println();
	}
}

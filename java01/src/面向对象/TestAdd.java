package 面向对象;

public class TestAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//实例化学生对象并初始化
		Student s=new Student();
		s.id=10;
		s.name="王紫";
		s.age=18;
		s.score=99;
		Student s1= new Student();
		s1.id=11;
		s1.name="郝田";
		s1.age=19;
		s1.score=60;
		//新增学生对象
		StudentsBii xin=new StudentsBii();
		xin.addStudent(s);
		xin.addStudent(s1);
		xin.showStudents();//显示学生信息

	}

}

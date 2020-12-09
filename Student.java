package xuanke;

public class Student {
	public String id;
	public String studentname;
	public String sex;
	public String study;
	public Student(String id,String studentname,String sex,String study)
	{
		this.id = id;
		this.studentname = studentname;
		this.sex = sex;
		this.study = study;
	}
	public String toString() {
		return "学生编号: "+this.id+"  姓名: "+this.studentname+"  性别: "+this.sex+"  所选课程:"+this.study;
	}
}

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
		return "ѧ�����: "+this.id+"  ����: "+this.studentname+"  �Ա�: "+this.sex+"  ��ѡ�γ�:"+this.study;
	}
}

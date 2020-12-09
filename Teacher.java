package xuanke;

public class Teacher {
	public String id;	 
	public String teachername;
	public String sex;
	public String teach;
	public Teacher(String id,String teachername,String sex,String teach)
	{
		this.id = id;
		this.teachername = teachername;
		this.sex = sex;
		this.teach = teach;
	}
	public String toString() {
		return "教师编号: "+this.id+"  姓名: "+this.teachername+"  性别: "+this.sex+"  教授课程:"+this.teach;
	}
}
package xuanke;

public class Course {
	public String id;
	public String name;
	public String classplace;
	public String classtime;
	public String teachername;
	public Course(String id,String name,String classplace,String classtime,String teachername)
	{
		this.id = id;
		this.name = name;
		this.classplace = classplace;
		this.classtime =  classtime;
		this.teachername = teachername;
	}
	public String toString() {
		return "课程编号: "+this.id+"  课程名称: "+this.name+"  上课地点: "+this.classplace+"  上课时间:"
	+this.classtime+"  授课教师:"+this.teachername;
	}
}

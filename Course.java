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
		return "�γ̱��: "+this.id+"  �γ�����: "+this.name+"  �Ͽεص�: "+this.classplace+"  �Ͽ�ʱ��:"
	+this.classtime+"  �ڿν�ʦ:"+this.teachername;
	}
}

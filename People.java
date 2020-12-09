package xuanke;

public class People {
	public String id;
	public String peoplename;
	public String sex;
	public People(String id,String peoplename,String sex)
	{
		this.id = id;
		this.peoplename = peoplename;
		this.sex = sex;
	}
	public String toString() {
		return "人员编号: "+this.id+"  姓名: "+this.peoplename+"  性别: "+this.sex;
	}
}

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
		return "��Ա���: "+this.id+"  ����: "+this.peoplename+"  �Ա�: "+this.sex;
	}
}

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
		return "��ʦ���: "+this.id+"  ����: "+this.teachername+"  �Ա�: "+this.sex+"  ���ڿγ�:"+this.teach;
	}
}
package xuanke;

public class Text {
	public static void main(String args[]){
		//import choose.people;
		//import choose.teacher;
		//import choose.student;
		//import choose.course;
		Student stu1 = new Student("207","��÷÷","Ů","����");
		Teacher tea1 = new Teacher("307","����ʦ","��","��ѧ����");
		Course cou1 = new Course("2","��ѧ����","��307","�������Ĵ��","����ʦ");
		People peo1 = new People("207","��÷÷","Ů");
		
		System.out.println(stu1.toString());
		System.out.println(tea1.toString());
		System.out.println(peo1.toString());
		System.out.println(cou1.toString());
	}
}

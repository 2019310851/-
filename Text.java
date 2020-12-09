package xuanke;

public class Text {
	public static void main(String args[]){
		//import choose.people;
		//import choose.teacher;
		//import choose.student;
		//import choose.course;
		Student stu1 = new Student("207","韩梅梅","女","高数");
		Teacher tea1 = new Teacher("307","李老师","男","大学物理");
		Course cou1 = new Course("2","大学物理","教307","第三、四大节","李老师");
		People peo1 = new People("207","韩梅梅","女");
		
		System.out.println(stu1.toString());
		System.out.println(tea1.toString());
		System.out.println(peo1.toString());
		System.out.println(cou1.toString());
	}
}

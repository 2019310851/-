# -
第二次实验
## 实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 实验过程
设计了course，people，student，teacher类
定义姓名，性别，学号，课程，课程名称，上课时间和地点的属性
让student和teacher类继承于people类
给变量赋值
## 核心方法
1 public String toString() {
		return "课程编号: "+this.id+"  课程名称: "+this.name+"  上课地点: "+this.classplace+"  上课时间:"
	+this.classtime+"  授课教师:"+this.teachername;}
  public String toString() {
		return "人员编号: "+this.id+"  姓名: "+this.peoplename+"  性别: "+this.sex;}
    public String toString() {
		return "学生编号: "+this.id+"  姓名: "+this.studentname+"  性别: "+this.sex+"  所选课程:"+this.study;}
public String toString() {
		return "教师编号: "+this.id+"  姓名: "+this.teachername+"  性别: "+this.sex+"  教授课程:"+this.teach;
	}
 
## 实验结果
输出学生姓名，学号，性别，所选课程，上课地点和时间
输出老师姓名，学号，性别，所教课程，上课地点和地点
## 实验感想
通过这次实验，学会定义类中的属性以及方法，我熟练使用了类的继承方法，懂得怎么用toString输出信息

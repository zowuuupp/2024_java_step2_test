package chapter08;

public class Student2 {
	
	public static int serialNum=10000;
	int studentID;
	String StudentName;
	int grade;
	String address;
	
	public Student2( ) {
		serialNum++;
		this.studentID=serialNum;
		//��������
		//studentID=++serialNum;
	}
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public static int getSerialNum() {
		return serialNum;
	}
	
	
	
	
	
	
}

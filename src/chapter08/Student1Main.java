package chapter08;

public class Student1Main {

	public static void main(String[] args) {
		
		Student1 studentLee = new Student1();
		studentLee.setStudentName("�̼���");
		System.out.println(studentLee.StudentName);
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		System.out.println();
		Student1 studentKim = new Student1();
		studentKim.setStudentName("�輺��");
		System.out.println(studentKim.StudentName);
		System.out.println(studentKim.serialNum);
		studentKim.serialNum++;
		
		System.out.println();
		Student1 studentPark = new Student1();
		studentPark.setStudentName("�ڿ���");
		System.out.println(studentPark.StudentName);
		System.out.println(studentPark.serialNum);
		studentPark.serialNum++;
		
		
	}

}

package chapter14.string;

import java.util.Objects;

public class Student {
	
	int studentId;
	String studentName;
	
	//������
	public Student(int studentId ,String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
	}

	//toString
	@Override
	public String toString() {
		return studentId+", "+studentName;
	}
	
	//������ �ּ�(�ܺ�, �ֱ����ġ �޸� �ּ� ,str1==str2)
	@Override
	public int hashCode() {
		return studentId;
	}
	
	
	//���� �ּ�(����, ��) 
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if (studentId==std.studentId) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}//�������� ���� �����ϽŰ�
	
	
	
	
	
	
}

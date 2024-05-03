package chapter14.string;

public class EqualsMain {

	public static void main(String[] args) {
		//String Ŭ������ �̹� toString�� ������ �Ǿ� ����.
		String str1=new String("test");
		String str2=new String("test");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
		
		Student studentLee=new Student(100,"���ڹ�");
		//System.out.println(studentLee);
		Student studentLee2=studentLee;
		Student studentJava=new Student(100,"���ڹ�");
		
		//������ �ּ� ����
		System.out.println("-----������ �ּ��� �� �ν��Ͻ� ��-----");
		if (studentLee == studentLee2) {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		}else {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		}
		
		//���� �ּ� ����
		if (studentLee.equals(studentLee2)) {
			System.out.println("studentLee�� studentLee2�� �����ϴ�.");
		}else {
			System.out.println("studentLee�� studentLee2�� �ٸ��ϴ�.");
		}
		
		//=========================================================
		
		//������ �ּ� �ٸ�
		System.out.println("---������ �ּҴ� �ٸ����� ������ ���� ����---");
		if (studentLee == studentJava) {
			System.out.println("studentLee�� studentJava�� �ּҴ� �����ϴ�.");
		}else {
			System.out.println("studentLee�� studentJava�� �ּҴ� �ٸ��ϴ�.");
		}
		
		//���� �ּ� ����
		if (studentLee.equals(studentJava)) {
			System.out.println("studentLee�� studentJava�� �����ϴ�.");
		}else {
			System.out.println("studentLee�� studentJava�� �ٸ��ϴ�.");
		}
		
		//=========================================================
		
		System.out.println("----������ �� ���----"); //(���� �����Ƿ� ������ ���� �����)
		System.out.println("studentLee�� hashCode: "+studentLee.hashCode());
		System.out.println("studentJava�� hashCode: "+studentJava.hashCode());
		
		
		System.out.println("----������ ���� ���� hashCode---");
		System.out.println("studentLee�� ���� hashCode: "+System.identityHashCode(studentLee));
		System.out.println("studentJava�� ���� hashCode: "+System.identityHashCode(studentJava));
		
		//������ �Ǿ� �ִ� HashCode
		System.out.println("--------StirngŬ������ ������--------");
		System.out.println("str1�� HashCode: "+str1.hashCode());
		System.out.println("str1�� HashCode: "+str2.hashCode());
		
	}

}

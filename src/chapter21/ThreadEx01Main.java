package chapter21;

public class ThreadEx01Main {

	public static void main(String[] args) {
		
		ThreadEx01 t1 = new ThreadEx01();
		t1.start(); //run() �޼ҵ� ȣ��Ǵ� �Ͱ� ����
		//t.run(); //�������� ������ �ִµ� ���� start��? �������� ������ ������ �������� ���� �� �Ѵ�. ȣ���� �� �ȴ�.
		
		System.out.println("main ����");
		
		//main�� ���� �ϰ� thread�� ���´�. 
		//�ѱ� �ڵ����� �����带 ���� ��� �ƹ��͵� �� �����µ� 20�п� �ڵ� ������ �ϴ� �� �ƴϴ�. �۾��� �����ؾ� �ð��� �帣�� ���߿� ������ �ȴ�.
	
		

	}

}

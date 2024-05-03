package chapter21;

public class Thread_Inter_Main implements Runnable{

	public static void main(String[] args) {
		
		/*
		���� Ŭ���� ����!
		run()
		first()
		second()
		*/
		
		System.out.println("���� Ŭ���� ����!");
		Thread_Inter_Main t1=new Thread_Inter_Main();
		t1.run(); //������ ������ Runnable�� run() �޼ҵ�
		System.out.println("====================================");
		
		Thread mThread = new Thread(t1);
		mThread.start();
		System.out.println("���� Ŭ���� ����");
		
		//"���� Ŭ���� ����"�� ��ġ�� ���� �ƴϴ�. �������� start�� ������ ����.
		
		/*
		run()
		first()
		second()
		���� Ŭ���� ����
		
		**������ ��������**
		���� Ŭ���� ����
		run()
		first()
		second()
		*/
		
	}

	@Override
	public void run() {
		System.out.println("run() �޼ҵ� ����");
		first();
	}
	
	public void first() {
		System.out.println("first() �޼ҵ� ����");
		second();
	}
	
	public void second() {
		System.out.println("second() �޼ҵ� ����");
	}
}

package chapter13;

class Outter2{
	//���1 : �͸��� Ŭ������ Ŭ���� �̸��� ����.
	Runnable getRunnable(int i) {
		int num=100;
		return new Runnable() {
			@Override
			public void run() {
				//num=200;
				//i=10;
				System.out.println(i);
				System.out.println(num); //�б⸸ �ȴ�.
			}
		}; //return
	}//Runnable
	
	//���2(���1�� ���� �����̰� �����δ� �̰� ����.)
	Runnable runner = new Runnable() { //Runnable�� �߻� �޼ҵ尡 �����Ѵ�. �̸� �ذ��ؾ� ��ü�� ������ �� �ִ�.
		
		@Override
		public void run() { //�̸� Ŭ����. ���� �ѹ� �˻��غ���.
			System.out.println("Runnable�� ������ �͸��� Ŭ���� ����");
			
		}
	};
	
	
}

public class AnonyMousInnerMain {

	public static void main(String[] args) {
		
		Outter2 outter2 = new Outter2();
		
		Runnable runnable = outter2.getRunnable(10);
		runnable.run(); //���1
		
		outter2.runner.run();//���2
		
		
		
		
		
		
		
		
		
	}

}

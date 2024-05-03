package chapter13;

class Outter{
	int outNum=100;
	static int sNum=200;
	
	//Runnable �Ű������� ��������� final�� ����Ѵ�.
	//Runnable�� Data������ ���� �͸��� Ŭ������� �Ѵ�.
	Runnable getRunnable(int i) {
		
		
		int num=100; //final �̴�. ������ �Ŵ�.
		
		class MyRunnable implements Runnable{
			int localNum=10; //���� ���
			@Override
			public void run() { //�̺�Ʈ ����Ű�� ��.
				//num=200; //num�� �̹� final�̴�.
				//i=100; //final
				System.out.println("int i="+i); //�д� �Ŵ� �������. �б⸸ �����ϴ�.
				System.out.println("int num="+num); 
				System.out.println("int outNum="+outNum);
				System.out.println("int localNum="+localNum);
				System.out.println("static int sNum="+sNum); //�д� �Ŵ� �������. �б⸸ �����ϴ�.
			}
			
		}
		
		return new MyRunnable();
	}//Runnable
}

public class LocalInner {

	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable runner =out.getRunnable(10); // new MyRunnable()�� Runnable Ÿ���̴�.
		runner.run();
		
		
		
		
		
		
		
		
	}

}

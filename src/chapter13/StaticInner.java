package chapter13;

public class StaticInner {
	
	int a=10;
	private int b=100;
	static int c=200;
	
	//������
	//�޼ҵ�
	
	//���� Ŭ����
	static class Inner{
		//�ʵ�
		static int d=1000;
		//������
		//�޼ҵ�
		public void printData() {
			//System.out.println("int a : "+a);
			//System.out.println("private int b=100 : "+b); // static�� ������ �����̶� static�� ����� �ȴ�. �׷��� �� ���� �Ǵ� ������ �͸� ���ݾ� ����.
			System.out.println("static int c : "+c);
			System.out.println("static int d : "+d);
		}

	}

	public static void main(String[] args) {
		StaticInner.Inner si = new StaticInner.Inner();
		si.printData();
		
		
		
		
		
		
	}

}

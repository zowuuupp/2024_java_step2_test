package chapter13;

public class MemberInner {
	
	int a=10;
	private int b=100;
	static int c=200;
	
	//������
	
	//�޼ҵ�
	
	//���� Ŭ����
	class Inner{
		//�ʵ�
		//������
		//�޼ҵ�
		public void printData() {
			System.out.println("int a: "+a);
			System.out.println("private int b: "+b);
			System.out.println("static int c: "+c);
		}
	}

	public static void main(String[] args) {
		//�ܺ�
		MemberInner outter = new MemberInner();
		MemberInner.Inner inner = outter.new Inner();
		//MemberInner.Inner inner = new MemberInner().new Inner(); (���� ���� �� �Ǵ�.)
		
		inner.printData();
		
		
		
		
		
		
		
		
		
	}

}

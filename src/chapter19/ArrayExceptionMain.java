package chapter19;

public class ArrayExceptionMain {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		/*
		for(int i=0; i<=5;i++) {
			System.out.println(arr[i]);
		}
		*/
		
		try {
			for(int i=0; i<=5;i++) {
				arr[i]=i+1; //������ �迭�濡 ������ �Է� 1 2 3 4 5
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println(e);
		} finally {
			//������ ���� ���� �ʴ� ������ �����Ѵ�.
			System.out.println("Finally!!");
			//������ ���̽��� �ݵ�� ���Ḧ ����� ���� �����Ͱ� ȣȯ�� �Ҷ� ����� �����ϴ�. �׷� �� ���� ����.
		}
		System.out.println();
		System.out.println("���α׷� ����");
	}
	
	
	
	
	
	
	
	
	

}

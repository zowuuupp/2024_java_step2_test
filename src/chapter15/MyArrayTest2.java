package chapter15;

class MyAraayG<E>{ //���׸� Ÿ���� <>�� �߿��Ѱ�. ���׸��� ������Ʈ��� �ص� �ȴ�. �ٵ� �÷��ǿ��� ����ϴ� ���̴�?
	//�������
	private Object[] array=new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++]=obj;
	}
	
	public E get(int index) {
		return (E)array[index];
	}
}


public class MyArrayTest2 {

	public static void main(String[] args) {
		
		MyArray1 myArray1=new MyArray1();
		myArray1.add(new String("test"));
		String arr0=(String)myArray1.get(0); //index�� �迭������ ÷�ڴ�.
		System.out.println(arr0);
		
		MyArray1 myArray2=new MyArray1();
		myArray2.add(new Integer(100));
		Integer num=(Integer)myArray2.get(0);
		System.out.println(num);
		
		
		
		
		
		
	}

}

package chapter15;

class MyArray1 {
	//�������
	private Object[] array=new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++]=obj;
	}
	
	public Object get(int index) {
		return array[index];
	}
}

public class MyArrayTest1 {

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

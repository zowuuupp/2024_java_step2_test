package chapter15;

class MyAraayG<E>{ //제네릭 타입은 <>가 중요한것. 제네릭은 오브젝트라고 해도 된다. 근데 컬렉션에서 사용하는 것이다?
	//멤버변수
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
		String arr0=(String)myArray1.get(0); //index는 배열에서의 첨자다.
		System.out.println(arr0);
		
		MyArray1 myArray2=new MyArray1();
		myArray2.add(new Integer(100));
		Integer num=(Integer)myArray2.get(0);
		System.out.println(num);
		
		
		
		
		
		
	}

}

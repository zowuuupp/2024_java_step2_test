package chapter13;

class Outter{
	int outNum=100;
	static int sNum=200;
	
	//Runnable 매개변수와 멤버변수는 final로 써야한다.
	//Runnable는 Data영역에 들어가며 익명의 클래스라고 한다.
	Runnable getRunnable(int i) {
		
		
		int num=100; //final 이다. 상수라는 거다.
		
		class MyRunnable implements Runnable{
			int localNum=10; //내부 멤버
			@Override
			public void run() { //이벤트 일으키는 것.
				//num=200; //num은 이미 final이다.
				//i=100; //final
				System.out.println("int i="+i); //읽는 거는 상관없다. 읽기만 가능하다.
				System.out.println("int num="+num); 
				System.out.println("int outNum="+outNum);
				System.out.println("int localNum="+localNum);
				System.out.println("static int sNum="+sNum); //읽는 거는 상관없다. 읽기만 가능하다.
			}
			
		}
		
		return new MyRunnable();
	}//Runnable
}

public class LocalInner {

	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable runner =out.getRunnable(10); // new MyRunnable()는 Runnable 타입이다.
		runner.run();
		
		
		
		
		
		
		
		
	}

}

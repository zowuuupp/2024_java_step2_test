package chapter13;

class Outter2{
	//방법1 : 익명의 클래스는 클래스 이름이 없다.
	Runnable getRunnable(int i) {
		int num=100;
		return new Runnable() {
			@Override
			public void run() {
				//num=200;
				//i=10;
				System.out.println(i);
				System.out.println(num); //읽기만 된다.
			}
		}; //return
	}//Runnable
	
	//방법2(방법1은 증명 느낌이고 실제로는 이걸 쓴다.)
	Runnable runner = new Runnable() { //Runnable은 추상 메소드가 존재한다. 이를 해결해야 객체를 생성할 수 있다.
		
		@Override
		public void run() { //이면 클래스. 예제 한번 검색해보자.
			System.out.println("Runnable이 구현된 익명의 클래스 변수");
			
		}
	};
	
	
}

public class AnonyMousInnerMain {

	public static void main(String[] args) {
		
		Outter2 outter2 = new Outter2();
		
		Runnable runnable = outter2.getRunnable(10);
		runnable.run(); //방법1
		
		outter2.runner.run();//방법2
		
		
		
		
		
		
		
		
		
	}

}

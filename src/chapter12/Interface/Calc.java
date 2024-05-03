package chapter12.Interface;

public interface Calc {
	//추상 클래스는 하나라도 정상 메소드가 올 수 있다. 
	double PI=3.14;
	int ERROR=-9999999; //기울이고 진한 글씨체는 final static 이라는 의미이다.
	
	//추상메소드
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// 자바 8부터 제공된 기능
	// default method : 기본 수행문을 가지는 메소드로 재정의 할 수 있음.
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod(); //private method 호출
	}
	
	//static method(정적 메소드) : 객체 생성과 관계없이 인터페이스타입(클래스명)으로 사용할 수 있음.
	static int total(int[] arr) {
		int  total=0;
		for(int i : arr) {
			total +=i;
		}
		myStaticMethod(); //private method 호출
		return total;
	}
	
	//private method : 인터페이스 클래스  내에서만 사용이 가능하며 재정의 할 수 없다.
	private void myMethod() {
		System.out.println("private 메소드 입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메소드 입니다.");
	}
	
	
	
	
	

}

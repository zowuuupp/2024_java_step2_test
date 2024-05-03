package chapter12.Interface;

public class CalculatorMain {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=5;
		
		// Calc calc= new Calc(); Calc는 인터페이스를 받는다.
		Calc calc= new CompleteCalc2();
		
		System.out.println("--default Method--");
		calc.description(); //Over 들어간게 우선권이다.
		
		System.out.println("---static Method---");
		int[] arr = {1,2,3,4,5};
		System.out.println("1~5까지의 합: "+Calc.total(arr)); // 정적 메소드
		System.out.println();
		
		System.out.println("--Interface Method 호출--");
		System.out.println("num1+num2: "+calc.add(num1, num2));
		System.out.println("num1-num2: "+calc.substract(num1, num2));
		System.out.println("num1*num2: "+calc.times(num1, num2));
		System.out.println("num/num2: "+calc.divide(num1, num2));
		
		System.out.println("--child method 호출--");
		//Calc calc= new CompleteCalc2(); 면 부모랑 아이의 공통 메소드만 사용할 수 있다.
		CompleteCalc2 calc2 = new CompleteCalc2();
		calc2.showInfo();
		
		
		
	}

}

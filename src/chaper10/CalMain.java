package chaper10;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		/*
		// 방법1 
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : "); 
		double n1 = scan.nextDouble();
		System.out.print("두 번째 숫자를 입력하세요 : "); 
		double n2 = scan.nextDouble();
		
		CalPlus cp = new CalPlus(); 
		System.out.println("CalPlus : " +cp.getResult(n1, n2));
		 
		CalMinus cm = new CalMinus(); 
		System.out.println("CalMinus : " +cm.getResult(n1, n2));
		*/
		
		/*
		// Cal 클래스로 내가 만들어서 한거
		Cal c = new Cal(); 
		c.cal(new CalPlus()); 
		c.cal(new CalMinus());
		*/

		// 응용
		
		// 방법1
		calc(new CalPlus(), 10, 20); // CalculatorExam c1 = new CalPlus();
		System.out.println("두 수의 합 : " + calc(new CalPlus(), 10, 20));
		calc(new CalMinus(), 10, 20); // CalculatorExam c1 = new CalMinus();
		System.out.println("두 수의 차 : " + calc(new CalMinus(), 10, 20));
		
		
		/*
		//방법2 , 못 하셔도 된다.
		System.out.println("-----방법2-----");
		CalculatorExam[] calculators = {new CalPlus(), new CalMinus()};
		//int arr[]={1,2};
		//for (int array:arr){}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 A를 입력하세요 : ");
		int a = scan.nextInt();
		System.out.print("정수 B를 입력하세요 : ");
		int b = scan.nextInt();
		//getClass().getSimpleName() : 클래스명 가져오기
		for(CalculatorExam ce : calculators) {
			System.out.println(ce.getClass().getSimpleName() + " : " + ce.getResult(a, b));
		}
		*/
		
		
	}

	// 응용 => CalculatorExam c1 : CalPlus, CalMinus
	public static double calc(CalculatorExam c1, double a, double b) {
		return c1.getResult(a, b);
	}

}

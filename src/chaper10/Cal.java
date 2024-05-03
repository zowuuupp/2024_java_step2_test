package chaper10;

import java.util.Scanner;

public class Cal { //내가 임의로 만든 것
	
	double n1;
	double n2;
	
	public void cal(CalculatorExam ce) {
		Scanner scan= new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		n1=scan.nextDouble();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		n2=scan.nextDouble();
		
		System.out.println(ce.getResult(n1, n2));
		
	}
	
	
	
}

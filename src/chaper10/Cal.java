package chaper10;

import java.util.Scanner;

public class Cal { //���� ���Ƿ� ���� ��
	
	double n1;
	double n2;
	
	public void cal(CalculatorExam ce) {
		Scanner scan= new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		n1=scan.nextDouble();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		n2=scan.nextDouble();
		
		System.out.println(ce.getResult(n1, n2));
		
	}
	
	
	
}

package chaper10;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		/*
		// ���1 
		Scanner scan = new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : "); 
		double n1 = scan.nextDouble();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : "); 
		double n2 = scan.nextDouble();
		
		CalPlus cp = new CalPlus(); 
		System.out.println("CalPlus : " +cp.getResult(n1, n2));
		 
		CalMinus cm = new CalMinus(); 
		System.out.println("CalMinus : " +cm.getResult(n1, n2));
		*/
		
		/*
		// Cal Ŭ������ ���� ���� �Ѱ�
		Cal c = new Cal(); 
		c.cal(new CalPlus()); 
		c.cal(new CalMinus());
		*/

		// ����
		
		// ���1
		calc(new CalPlus(), 10, 20); // CalculatorExam c1 = new CalPlus();
		System.out.println("�� ���� �� : " + calc(new CalPlus(), 10, 20));
		calc(new CalMinus(), 10, 20); // CalculatorExam c1 = new CalMinus();
		System.out.println("�� ���� �� : " + calc(new CalMinus(), 10, 20));
		
		
		/*
		//���2 , �� �ϼŵ� �ȴ�.
		System.out.println("-----���2-----");
		CalculatorExam[] calculators = {new CalPlus(), new CalMinus()};
		//int arr[]={1,2};
		//for (int array:arr){}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� A�� �Է��ϼ��� : ");
		int a = scan.nextInt();
		System.out.print("���� B�� �Է��ϼ��� : ");
		int b = scan.nextInt();
		//getClass().getSimpleName() : Ŭ������ ��������
		for(CalculatorExam ce : calculators) {
			System.out.println(ce.getClass().getSimpleName() + " : " + ce.getResult(a, b));
		}
		*/
		
		
	}

	// ���� => CalculatorExam c1 : CalPlus, CalMinus
	public static double calc(CalculatorExam c1, double a, double b) {
		return c1.getResult(a, b);
	}

}

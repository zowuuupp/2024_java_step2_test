package chapter12.Interface;

public class CalculatorMain {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=5;
		
		// Calc calc= new Calc(); Calc�� �������̽��� �޴´�.
		Calc calc= new CompleteCalc2();
		
		System.out.println("--default Method--");
		calc.description(); //Over ���� �켱���̴�.
		
		System.out.println("---static Method---");
		int[] arr = {1,2,3,4,5};
		System.out.println("1~5������ ��: "+Calc.total(arr)); // ���� �޼ҵ�
		System.out.println();
		
		System.out.println("--Interface Method ȣ��--");
		System.out.println("num1+num2: "+calc.add(num1, num2));
		System.out.println("num1-num2: "+calc.substract(num1, num2));
		System.out.println("num1*num2: "+calc.times(num1, num2));
		System.out.println("num/num2: "+calc.divide(num1, num2));
		
		System.out.println("--child method ȣ��--");
		//Calc calc= new CompleteCalc2(); �� �θ�� ������ ���� �޼ҵ常 ����� �� �ִ�.
		CompleteCalc2 calc2 = new CompleteCalc2();
		calc2.showInfo();
		
		
		
	}

}

package chapter12.Interface;

public class CompleteCalc2 extends CompleteCalc1 {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		/*
		try�� 
		try { 
			return num1/num2; //�����ϰ��� �ϴ� �� 
		} 
		catch (Exception e) { //������ ���� ����� ��� ä���ڴ�.
			return Calc.ERROR; 
		 }
		 */

		if (num2 != 0) {
			return num1 / num2;
		} else {
			return Calc.ERROR;
		}

	}// divide

	//����Ʈ�޼��� override
	@Override
	public void description() {
		//super.description();
		System.out.println("�Ϻ��� ���� �Դϴ�.");
	}
	
	public void showInfo() { //�θ����� ���� ������ ��.
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}
	
}

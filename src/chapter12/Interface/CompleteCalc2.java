package chapter12.Interface;

public class CompleteCalc2 extends CompleteCalc1 {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		/*
		try문 
		try { 
			return num1/num2; //수행하고자 하는 거 
		} 
		catch (Exception e) { //에러가 나면 여기로 잡아 채오겠다.
			return Calc.ERROR; 
		 }
		 */

		if (num2 != 0) {
			return num1 / num2;
		} else {
			return Calc.ERROR;
		}

	}// divide

	//디폴트메서드 override
	@Override
	public void description() {
		//super.description();
		System.out.println("완벽한 계산기 입니다.");
	}
	
	public void showInfo() { //부모한테 없는 아이의 것.
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
	
}

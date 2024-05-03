package chapter12.Interface;

//인터페이스를 상속(implements)받았으나 add/substaract만 구현하였으므로 여전히 미완성 클래스. 그래서 abstract를 써준다.
public abstract class CompleteCalc1 implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}
	
	
	
}

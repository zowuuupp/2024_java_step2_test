package chapter12.MultiInterface;

import chapter12.Interface.Calc;
import chapter12.Interface.CompleteCalc2;

public class Multiple extends CompleteCalc2 implements Calc, Runnable{
	//Runnable안에 메소드는 run하나. 중요한 것이다?
		
	public static void main(String[] args) {
		
		
	}
	
	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return super.times(num1, num2);
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return super.divide(num1, num2);
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		super.description();
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
	}

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return super.add(num1, num2);
	}

	@Override
	public void run() {
		
	}

}

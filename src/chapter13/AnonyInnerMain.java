package chapter13;

import chapter09.Car;

public class AnonyInnerMain {
	
	public void test() {
		new TestInter() {
			
			@Override
			public void printData() {
				System.out.println("홧팅!!!");
			}//추상메소드 구현
		}.printData();
		
		/*
		//Car c= new Car();
		//c.getClass();
		new Car().getClass();
		*/
		
	}

	public static void main(String[] args) {
		
		AnonyInnerMain in = new AnonyInnerMain();
		in.test();
		
		
		
	}

}

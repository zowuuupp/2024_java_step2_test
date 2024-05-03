package chaper10;

public class Vehicle {
	
	//전역변수 price=1000;
	private static final int price=1000;
	
	public int veheclePrice() {
		return this.price;
	}
	
	public void run() {
		System.out.println("차량이 달립니다.");
	}
	
	
}

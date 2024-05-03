package chapter11;

public class CarMain {
	/*
	public static void main(String[] args) {
		
		method(new ManualCar());
		System.out.println("=================================");
		method(new AICar());
		
	}
	
	public static void method(Car car) {
		car.drive();
		car.stop();
	}
	*/
	
	public static void main(String[] args) {
		System.out.println("-----磊啦林青-----");
		Car mycar=new AICar();
		mycar.run();
		
		System.out.println("-----荤恩林青-----");
		Car mycar2=new ManualCar();
		mycar2.run();
	}
	
}

package chapter09;

public class Car {
	
	public int speed;
	
	public void speedUp() {
		speed+=1;
		System.out.println(speed);
	}
	
	public final void stop() {//중요한 거라 다른데 변형되기 원하지 않는다. final, 상속은 되나 변형이 안된다.
		System.out.println("자동차가 멈춥니다.");
		speed=0;
	}
	

}

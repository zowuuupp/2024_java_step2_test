package chapter11;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행을 합니다.");
		System.out.println("자동차가 스스로 방향을 정합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 정지 합니다.");
	}

}

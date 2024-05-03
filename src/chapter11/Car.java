package chapter11;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();

	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}

	// ���ø� �޼ҵ� : ������. ��, �����ǰ� �� ��.
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}

}

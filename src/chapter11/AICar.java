package chapter11;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���� ������ �մϴ�.");
		System.out.println("�ڵ����� ������ ������ ���մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ ���� �մϴ�.");
	}

}

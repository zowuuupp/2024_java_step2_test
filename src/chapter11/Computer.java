package chapter11;

//�߻� Ŭ���� : �ϳ� �̻��� �߻�޼ҵ尡 ����
//�� �ϳ��� �߻� �޼ҵ尡 �����ϸ� �ݵ�� abstractŰ���� �߰�

public abstract class Computer {
	
	//�߻� �޼ҵ� �� �ٵ�{}, �� ���๮�� ���� �޼ҵ�
	public abstract void disply();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ ŵ�ϴ�.");
	}
	//���� �޼ҵ尡 �־ abstract�� �־�� �Ѵ�.
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}

}

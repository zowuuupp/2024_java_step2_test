package chapter11;

public class AdvencedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� jump�� �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("turn�� �Ұ��� �մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****�߱��� �Դϴ�.*****");
	}
	
	
	
	
	

}

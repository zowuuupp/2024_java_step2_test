package chapter12.MultiInterface;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("�������� ���濡�� ����մϴ�.");
	}
	
	
	
	
	
	
	
	
	

}

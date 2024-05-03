package chaper10;

public class SupersonicAirplane extends Airplane{
	
	//NORMAL=1 SUPERSONIC=2
	//�ʵ�(��������(Data ������� = static) => ������ �� ���� ����)
	
	static final int NORMAL=1;
	static final int SUPERSONIC=2;
	
	public int flyMode=NORMAL;
	
	
	//�������̵��� �̿��Ͽ� flyMode�� SUPERSONIC�̸� ������ �����Դϴ�. �׷��� ������ Airplane�� fly�� �����Ѵ�.
	@Override
	public void fly() {
		if	(flyMode == SUPERSONIC) {
			System.out.println("������ �����Դϴ�.");
		}
		else {
			super.fly();
		}
	}
}

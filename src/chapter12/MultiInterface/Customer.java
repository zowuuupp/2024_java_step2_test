package chapter12.MultiInterface;

public class Customer implements Buy,Sell{

	@Override
	public void buy() {
		System.out.println("�����ϱ�");
	}

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}
	
	//���� �޼ҵ���� �����ϸ� �������̵� �ʼ�
	/*
	@Override
	public void order() {
		System.out.println("���� �ֹ�");
	}
	*/
	
}

package chapter21;

public class Account {
	
	int balance = 1000; //�ܾ�

	//��ݸ޼���
	public synchronized void withdraw(int money) {
		
		if(balance < money) {
			try {
				wait(); //�����尡 �Ͻ������� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		balance-=money;
		
	}
	
	//�Աݸ޼���
	public synchronized void deposit(int money) {
		
		balance+=money;
		notify();//������ ������ ����
		
	}

}

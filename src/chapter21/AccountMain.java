package chapter21;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc = new Account();
		Runnable r = new AccountThread(acc);
		
		//������ȭ�� ��ȯ
		Thread t1= new Thread(r);
		t1.start(); //������ �ϴ°Ÿ� r.run();�� ����.
		
		
		//������ʹ� �������. ������ ����
		while(true) {
			System.out.print("�Ա��� ���� �Է��ϼ���: ");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			acc.deposit(n);
			
			if(acc.balance == 0) {
				break;
			}
			
		}
		
	}

}

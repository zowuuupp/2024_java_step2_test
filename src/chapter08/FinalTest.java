package chapter08;

import javax.swing.JOptionPane;

public class FinalTest {
	//�������(������ ���) -> static�� ���� ���� ���������� �ȴ�.
	private static final int MAX=3;//static�� ������ �̷��� ����Ÿ, static�̴� �߿��� ���ϰ��̴�? private�� ����.

	public static void main(String[] args) {
		//��������(���� ���������� ����� �����ϴ�) (���� : ���⼭�� ���̰� �ٸ��� ����� �Ҹ��Ѵ�.)
		int num=0;//����
		num=1;//������
		
		for(int i=0; i<MAX;i++) { //���� �����̶� �ٸ���. ��� �ؾ� �ұ�? ����Ÿ��. �׷� �� �������� ��� �Ѵ�. static�� ������ �߰��ϸ� �ȴ�.
			num=Integer.parseInt(JOptionPane.showInputDialog("�� �Է�"));
			if (num >MAX) {
				System.out.println("�Է��Ͻ� ���ڴ� 3���� Ů�ϴ�.");
			}
			else {
				System.out.println("�Է��Ͻ� ���ڴ� 3���� �۰ų� �����ϴ�.");
			}	
		}
		
		
		
	}

}

package chapter13;

import javax.swing.JOptionPane;

class Out2{
	//��� ����
	static int a=1; //��������(�����޼ҵ�)�� Ŭ�������� �ϳ��� �����ϸ� ��� ��ü�� ������ �� ����
	int b; //��ü���� ���� �ٸ� ���� ���� �� ����
	
	public static class In{
		String Infun() {
			return (a+"��° static ���� Ŭ����");
		}
	}
}

public class StaticMain {

	public static void main(String[] args) {
		//static�� Ŭ���������� ���� ������ ����
		Out2.In obj2 = new Out2.In();
		//���ο� �ִ� �޼ҵ�
		String str = obj2.Infun();
		JOptionPane.showMessageDialog(null, str+"\n Success");
		
		
		
		
		
		
		
		
	}

}

package chapter13;

import javax.swing.JOptionPane;

class Out{
	//�ʵ�
	static int a=1;
	
	//������
	
	//�޼ҵ�
	
	//���� Ŭ����(ȸ�������� ������ �� �̺�Ʈ��� �ϴ� �� �̷��� ����Ŭ������ ���� ����Ѵ�.)
	public class In{
		//�ʵ�
		
		//������
		
		//�޼ҵ�
		public String Infun() {
			return (a+"��° Non-Static ���� Ŭ���� �޼ҵ� �ǽ�");
		}
		
	}//Inner class
	
}//Outter class

public class NonStatic {

	public static void main(String[] args) {
		//1. �ٱ� Ŭ���� ��ü ����(obj1)
		Out obj1 = new Out();
		//2. ���� Ŭ���� ��ü ����(obj2)
		Out.In obj2 = obj1.new In();
		//3. ���ο� �ִ� �޼ҵ�
		String str=obj2.Infun();
		JOptionPane.showMessageDialog(null, str+"\n Success");
		
		
		
	}

}

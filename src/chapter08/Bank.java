package chapter08;

public class Bank {
	
	private String point;//������
	private String tel;
	static float interest;
	
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	}
	
	//����� ����� �޼ҵ�
	public void getBank() {
		System.out.println("���� : "+point+"\n"+"��ȭ��ȣ : "+tel+"\n"+"�������� : "+interest);
	}
	

}

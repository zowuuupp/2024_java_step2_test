package chapter21;

public class ThreadEx02Main {

	public static void main(String[] args) {
		
		ThreadEx02 t2 = new ThreadEx02(); // 0~9������ ��Ұ� ����� temp�������� ������
		
		t2.start();
		
		try {
			Thread.sleep(2000); //2��
			System.out.println("���α׷��� ����˴ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		} //�갡 main�̶� ���� �Ǵ� �� �´µ� �̰Ŵ� 2�ʿ� �����°Ŷ� 2�ʿ� ������ ���̴�.

	}

}

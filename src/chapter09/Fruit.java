package chapter09;

public class Fruit {

	private String sort; // �з�
	private String season; // ��������

	// ������

	// setter
	public void Set1(String a, String b) {
		sort = a;
		season = b;
	}

	// getter
	public void Disp1() {
		System.out.println("�з� : " + sort);
		System.out.println("���� : " + season);
	}

}

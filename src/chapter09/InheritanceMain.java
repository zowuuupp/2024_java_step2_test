package chapter09;

public class InheritanceMain {

	public static void main(String[] args) {

		Berry b = new Berry();

		b.Disp1();

		StrawBerry ob = new StrawBerry();

		ob.Set1("Berry", "����");
		ob.Set2("����", "��");
		ob.Set3("����", 7000);
		ob.Disp1();
		System.out.println("=========================");
		ob.Disp2();
		System.out.println("=========================");
		ob.Disp3();
		System.out.println("=========================");

		// extends�� ���ؼ� Ŭ������ Ȯ����Ѽ� ������ �� �ִ�. ��� ���ÿ� 2���� �� �����´�.

	}

}

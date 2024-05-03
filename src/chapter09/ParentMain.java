package chapter09;

public class ParentMain {

	public static void main(String[] args) {

		ChildExam c1 = new ChildExam();

		System.out.println(c1.getCar());
		System.out.println(c1.getMoney());
		System.out.println("--------------------------------");

		// �����̾� Ŭ������ ������ ��� ������ ������ ���� Ŭ������ ����
		// ������ ���� �Ұ����� ����. �̸� Ȯ���غ���.

		if (c1 instanceof ParentExam) {
			System.out.println("c1�� ParentExam�� �ڽ� Ŭ���� �Դϴ�.");
			System.out.println(c1.getMoney());
		}

		// ======================================================

		// ����ȯ
		ChildExam ch = new ChildExam();
		ParentExam p1 = new ParentExam();
		System.out.println("----------------------------");
		// �θ�>�ڽ�
		p1 = ch; // ������ ����ȯ, �ٵ� �� ���� ����. �ڽĲ��� ������ ���� �� �Ѵ�.
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		System.out.println("----------------------------");
		ch = (ChildExam) p1; // ������� �� ���� ������ ĳ������ ���ؼ� ������� ����ȯ�� �Ѵ�.
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());

	}

}

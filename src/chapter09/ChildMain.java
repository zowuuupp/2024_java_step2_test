package chapter09;

public class ChildMain {

	public static void main(String[] args) {

		Child child = new Child();

		child.method1();// �θ�
		child.method2();// ������ ����(����� �߱� ������)
		child.method3();// ���� ����

		// -------------------------
		System.out.println();
		// ���������� �θ� Ŭ������ ��� ����
		Parent parent1 = new Parent();
		parent1.method1();// �θ�
		parent1.method2();// �θ�

		// -------------------------
		System.out.println();
		Parent parent2 = child;
		parent2.method1();// �θ�
		parent2.method2();// �ڽĲ��� �����ؼ� ���

	}

}

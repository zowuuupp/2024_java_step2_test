package chapter09;

public class Child extends Parent {

	@Override
	public void method2() {// �θ�� ���� ������ �߰��� ������ �ƴϸ� ���ְ� �ٽ� �Ұ�����. ���𵨸�����
		System.out.println("Parent_Child-method2()"); // ���ְ� ���� �������.
	}

	public void method3() {
		System.out.println("Child-method3()");
	}

}

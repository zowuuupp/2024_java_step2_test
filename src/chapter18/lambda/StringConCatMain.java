package chapter18.lambda;

public class StringConCatMain {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";

		// �ν���Ʈ �޼ҵ� ȣ�� ���(���� ���� �� ����� ġ��)
		System.out.println("-----�ν��Ͻ� ���-----");

		StringConCatImple scci = new StringConCatImple();

		scci.makeString(s1, s2);

		// ���ٽ� ȣ��
		System.out.println("-----���ٽ� ȣ��-----");
		StringConCat concat = (s, v) -> System.out.println(s + " " + v);
		concat.makeString("Hello", "World");

		// �͸��� ���� Ŭ���� ȣ��
		System.out.println("----�͸��� ���� Ŭ����----");
		StringConCat concat2 = new StringConCat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
		};
		concat.makeString(s1, s2);
	}

}

package chapter09;

public class ChildMain {

	public static void main(String[] args) {

		Child child = new Child();

		child.method1();// 부모꺼
		child.method2();// 수정한 내꺼(덮어쓰기 했기 때문에)
		child.method3();// 원래 내꺼

		// -------------------------
		System.out.println();
		// 독립적으로 부모 클래스만 사용 가능
		Parent parent1 = new Parent();
		parent1.method1();// 부모꺼
		parent1.method2();// 부모꺼

		// -------------------------
		System.out.println();
		Parent parent2 = child;
		parent2.method1();// 부모꺼
		parent2.method2();// 자식꺼를 복제해서 사용

	}

}

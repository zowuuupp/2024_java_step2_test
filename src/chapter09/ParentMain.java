package chapter09;

public class ParentMain {

	public static void main(String[] args) {

		ChildExam c1 = new ChildExam();

		System.out.println(c1.getCar());
		System.out.println(c1.getMoney());
		System.out.println("--------------------------------");

		// 지금이야 클래스가 적으니 상속 구분이 되지만 많은 클래스를 쓰면
		// 구분이 거의 불가능해 진다. 이를 확인해보자.

		if (c1 instanceof ParentExam) {
			System.out.println("c1은 ParentExam의 자식 클래스 입니다.");
			System.out.println(c1.getMoney());
		}

		// ======================================================

		// 형변환
		ChildExam ch = new ChildExam();
		ParentExam p1 = new ParentExam();
		System.out.println("----------------------------");
		// 부모>자식
		p1 = ch; // 묵시적 형변환, 근데 쓸 일이 없다. 자식꺼를 어차피 쓰지 못 한다.
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		System.out.println("----------------------------");
		ch = (ChildExam) p1; // 원래라면 줄 수는 없으나 캐스팅을 통해서 명시적인 형변환을 한다.
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());

	}

}

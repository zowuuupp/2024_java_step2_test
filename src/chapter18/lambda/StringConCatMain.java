package chapter18.lambda;

public class StringConCatMain {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";

		// 인스턴트 메소드 호출 방식(오늘 수업 안 들었다 치고)
		System.out.println("-----인스턴스 방식-----");

		StringConCatImple scci = new StringConCatImple();

		scci.makeString(s1, s2);

		// 람다식 호출
		System.out.println("-----람다식 호출-----");
		StringConCat concat = (s, v) -> System.out.println(s + " " + v);
		concat.makeString("Hello", "World");

		// 익명의 내부 클래스 호출
		System.out.println("----익명의 내부 클래스----");
		StringConCat concat2 = new StringConCat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
		};
		concat.makeString(s1, s2);
	}

}

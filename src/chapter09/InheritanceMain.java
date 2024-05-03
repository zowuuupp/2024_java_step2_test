package chapter09;

public class InheritanceMain {

	public static void main(String[] args) {

		Berry b = new Berry();

		b.Disp1();

		StrawBerry ob = new StrawBerry();

		ob.Set1("Berry", "여름");
		ob.Set2("딸기", "중");
		ob.Set3("빨강", 7000);
		ob.Disp1();
		System.out.println("=========================");
		ob.Disp2();
		System.out.println("=========================");
		ob.Disp3();
		System.out.println("=========================");

		// extends를 통해서 클래스를 확장시켜서 가져올 수 있다. 대신 동시에 2개를 못 가져온다.

	}

}

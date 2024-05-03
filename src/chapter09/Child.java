package chapter09;

public class Child extends Parent {

	@Override
	public void method2() {// 부모님 것을 가지고 추가할 것인지 아니면 없애고 다시 할것인지. 리모델링개념
		System.out.println("Parent_Child-method2()"); // 없애고 새로 만들었다.
	}

	public void method3() {
		System.out.println("Child-method3()");
	}

}

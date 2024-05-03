package chapter21;

public class ThreadEx02Main {

	public static void main(String[] args) {
		
		ThreadEx02 t2 = new ThreadEx02(); // 0~9까지의 요소가 저장된 temp변수방이 생성됨
		
		t2.start();
		
		try {
			Thread.sleep(2000); //2초
			System.out.println("프로그램이 종료됩니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} //얘가 main이라 먼저 되는 게 맞는데 이거는 2초에 끼어드는거라 2초에 나오는 것이다.

	}

}

package chapter21;

public class ThreadEx01Main {

	public static void main(String[] args) {
		
		ThreadEx01 t1 = new ThreadEx01();
		t1.start(); //run() 메소드 호출되는 것과 같다
		//t.run(); //독립적인 공간이 있는데 굳이 start를? 독립적인 공간은 있지만 컴파일을 하지 못 한다. 호출이 안 된다.
		
		System.out.println("main 종료");
		
		//main을 먼저 하고 thread께 들어온다. 
		//한글 자동저장 스레드를 예로 들면 아무것도 안 적었는데 20분에 자동 저장을 하는 게 아니다. 작업을 시작해야 시간이 흐르고 나중에 저장이 된다.
	
		

	}

}

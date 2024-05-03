package chapter21;

public class Thread_Inter_Main implements Runnable{

	public static void main(String[] args) {
		
		/*
		메인 클래스 시작!
		run()
		first()
		second()
		*/
		
		System.out.println("메인 클래스 시작!");
		Thread_Inter_Main t1=new Thread_Inter_Main();
		t1.run(); //컴파일 가능한 Runnable의 run() 메소드
		System.out.println("====================================");
		
		Thread mThread = new Thread(t1);
		mThread.start();
		System.out.println("메인 클래스 종료");
		
		//"메인 클래스 종료"의 위치가 밑이 아니다. 스레드의 start는 메인이 먼저.
		
		/*
		run()
		first()
		second()
		메인 클래스 종료
		
		**스레드 수행절차**
		메인 클래스 종료
		run()
		first()
		second()
		*/
		
	}

	@Override
	public void run() {
		System.out.println("run() 메소드 실행");
		first();
	}
	
	public void first() {
		System.out.println("first() 메소드 실행");
		second();
	}
	
	public void second() {
		System.out.println("second() 메소드 실행");
	}
}

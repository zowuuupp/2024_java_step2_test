package chapter11;

public class DeskTop extends Computer{ //예전처럼 하면 상속이 안 된다.
									   //밑에 오버라이드로 추상메소드를 설정해줘야 인정해준다.
	@Override
	public void disply() {
		System.out.println("DeskTop Disply()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");
	} 
	
	
	
	
	
	
	
	
}

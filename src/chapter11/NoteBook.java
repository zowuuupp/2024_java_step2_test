package chapter11;

public abstract class NoteBook extends Computer{//근데 disply()만 쓰고 싶다.
												
	//상속 받은 두 개의 추상메소드 중 하나만 정의해서 사용할 경우. 추상 클래스로 abstract키워드 선언
	@Override
	public void disply() {
		System.out.println("NoteBook Disply()");
	}
	
	
	
	
	
	
	
	

}

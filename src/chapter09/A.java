package chapter09;

public class A {
	
	/*
	protected=public 이다.
	프로젝트를 하다보면 패키지가 다른 경우가 생긴다. 회원가입의 경우 member라는 클래스는 쓰는데 같은 패키지 내에서는 public이다.
	그러다가 정보를 분석하는 곳(다른 패키지)에 공유 하는 것을 막고 싶은때는 private의 성격을 띤다.
	*/
	
	protected String field; //public, But 상속전용
	
	//생성자
	
	public void methodA() {
		System.out.println("A Class");
		System.out.println("field");
	}
	
	
	
	

}

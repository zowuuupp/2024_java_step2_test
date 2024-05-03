package chapter08;

public class StaticFunction {
	
	String str1="일반 회원변수";
	static String str2="Static 회원변수";
	
	public static String getStatic() {
		//static 메소드는 static변수만 사용이 가능하다.
		//str1="MEMBER"; (위에 str1은 힙의 영역에 있고 여기는 데이터의 영역이다.)
		str2="VIP";
		return str2;
	}
	
	public void add() {
		System.out.println(1+2);
	}
	
	

}

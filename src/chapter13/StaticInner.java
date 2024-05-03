package chapter13;

public class StaticInner {
	
	int a=10;
	private int b=100;
	static int c=200;
	
	//생성자
	//메소드
	
	//내부 클래스
	static class Inner{
		//필드
		static int d=1000;
		//생성자
		//메소드
		public void printData() {
			//System.out.println("int a : "+a);
			//System.out.println("private int b=100 : "+b); // static은 데이터 영역이라서 static만 취급이 된다. 그래서 다 공유 되는 귀중한 것만 조금씩 쓴다.
			System.out.println("static int c : "+c);
			System.out.println("static int d : "+d);
		}

	}

	public static void main(String[] args) {
		StaticInner.Inner si = new StaticInner.Inner();
		si.printData();
		
		
		
		
		
		
	}

}

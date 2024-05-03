package chapter14.string;

public class StringEqualsMain {

	public static void main(String[] args) {
		
		String strVar1=new String("홍길동");
		String strVar2="홍길동";
		
		if(strVar1==strVar2) { //외부(메모리 같은지 비교)
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if (strVar1.equals(strVar2)) { //내부(메모리가 같은지 비교)
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		
	}

}

package chapter14.string;

public class EqualsMain {

	public static void main(String[] args) {
		//String 클래스는 이미 toString이 재정의 되어 있음.
		String str1=new String("test");
		String str2=new String("test");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
		
		Student studentLee=new Student(100,"이자바");
		//System.out.println(studentLee);
		Student studentLee2=studentLee;
		Student studentJava=new Student(100,"이자바");
		
		//물리적 주소 동일
		System.out.println("-----동일한 주소의 두 인스턴스 비교-----");
		if (studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		}else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}
		
		//논리적 주소 동일
		if (studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2의 같습니다.");
		}else {
			System.out.println("studentLee와 studentLee2의 다릅니다.");
		}
		
		//=========================================================
		
		//물리적 주소 다름
		System.out.println("---물리적 주소는 다르지만 논리적인 값은 동일---");
		if (studentLee == studentJava) {
			System.out.println("studentLee와 studentJava의 주소는 같습니다.");
		}else {
			System.out.println("studentLee와 studentJava의 주소는 다릅니다.");
		}
		
		//논리적 주소 동일
		if (studentLee.equals(studentJava)) {
			System.out.println("studentLee와 studentJava의 같습니다.");
		}else {
			System.out.println("studentLee와 studentJava의 다릅니다.");
		}
		
		//=========================================================
		
		System.out.println("----데이터 값 출력----"); //(내가 재정의로 억지로 같게 만든거)
		System.out.println("studentLee의 hashCode: "+studentLee.hashCode());
		System.out.println("studentJava의 hashCode: "+studentJava.hashCode());
		
		
		System.out.println("----데이터 값이 같은 hashCode---");
		System.out.println("studentLee의 실제 hashCode: "+System.identityHashCode(studentLee));
		System.out.println("studentJava의 실제 hashCode: "+System.identityHashCode(studentJava));
		
		//재정의 되어 있는 HashCode
		System.out.println("--------Stirng클래스의 실제값--------");
		System.out.println("str1의 HashCode: "+str1.hashCode());
		System.out.println("str1의 HashCode: "+str2.hashCode());
		
	}

}

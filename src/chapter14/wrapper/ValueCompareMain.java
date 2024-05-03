package chapter14.wrapper;

public class ValueCompareMain {

	public static void main(String[] args) {
		
		System.out.println("[-128 ~ 128 초과값일 경우]"); //1byte=8bit
		Integer obj1=300; //4바이트 => 32비트
		Integer obj2=300;
		
		//주소를 비교
		System.out.println("==결과 : "+(obj1==obj2)); //외부 (즉, 주소는 다르다)
		System.out.println("==언박싱한후 결과 : "+(obj1.intValue()==obj2.intValue()));//내부(클래식으로 포장된 박싱을 벗긴다 라고 생각하면 된다)
		
		//============================================================================
		System.out.println("[-128 ~ 128 범위값일 경우]"); //1byte=8bit
		Integer obj3=100; //4바이트 => 32비트
		Integer obj4=100;
		//주소를 비교
		System.out.println("==결과 : "+(obj3==obj4)); //외부
		System.out.println("==언박싱한후 결과 : "+(obj3.intValue()==obj4.intValue()));//내부
		System.out.println("==equals 결과 : "+obj3.equals(obj4));//외부로 접근하여 내부까지 , 이런 경우 때문에 equals를 많이 쓴다.
		
		
		
		
		
	}

}

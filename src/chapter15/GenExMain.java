package chapter15;

public class GenExMain {

	public static void main(String[] args) {
		// 사용자가 원하는 형태로 객체 생성
		GenEx<String> v1 = new GenEx<String>();
		v1.setValue("100");
		System.out.println(v1.getValue());
		
		//제네릭 타입은 기본자료형(int, double, char)을 인식할 수 없음
		//그러므로 반드시 오토박싱된 자료타입 선언
		GenEx<Integer> v2 = new GenEx<Integer>();
		v2.setValue(200);
		System.out.println(v2.getValue());
		
		GenEx<Double> v3 = new GenEx<Double>();
		v3.setValue(300.0);
		System.out.println(v3.getValue());
		
		GenEx<Character> v4 = new GenEx<Character>();
		v4.setValue('A');
		System.out.println(v4.getValue());
		
	}

}

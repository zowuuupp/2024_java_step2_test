package chapter14.wrapper;

public class IntegerTest {
	
	public static void main(String[] args) {
		
		//int i=100; //일반자료형
		//Integer i=new Integer(100);//클래스형 선언
		
		Integer num = 200; //오토박싱 : 일반자료를 클래스형 변수에 초기값으로 사용(묵시적 형변환)
		int iNum=num.intValue();//언박싱 : num은 클래스형이다. 클래스형 자료가 일반형 타입의 정수방에 대입(명시적 형변환)
		
		int jNum=200;
		
		int sum=iNum+jNum; 
		System.out.println(sum);
		
		//언박싱
		int total=num+jNum; //num.intValue(얘가 일반자료형으로 변경된 것?)+jNum
		System.out.println(total);
		
		//오토박싱(int => Integer)
		Integer i = jNum;
		System.out.println(i);
	}

}

package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		//객체로 접근
		StaticFunction st=new StaticFunction();
		System.out.println(st.str2);
		String s=st.getStatic();
		System.out.println(s);
		//클래스 명으로 접근
		String str;
		str=StaticFunction.getStatic();
		System.out.println(str);
		
		
		//StaticFunction.add 는 나오지 않고 st.add 는 나온다.
		//static 메소드 끼리는 클래스 명으로 접근이 가능하다.
	}

}

package chapter14.string;

public class StringTest {

	public static void main(String[] args) {
		String str="";
		String str1="Hi everybody!";
		String str2=" Have a nice Day!";
		
		System.out.println(System.identityHashCode(str1)); //주소 번지
		
		str=str1+str2;
		System.out.println(str);
		System.out.println(System.identityHashCode(str1)); //주소 같음	
		System.out.println();
		//str1의 다른 주소 생성
		str1=str1.concat(str2);//concat 은 문자를 연결해주는 것.
		System.out.println(System.identityHashCode(str1)); //주소 다름
		
		//str1의 같은 주소 생성
		str=str1.concat(str2);
		System.out.println(System.identityHashCode(str1)); //주소 같음
		
		
		System.out.println("str1 글자수 : "+str1.length());
		System.out.println("str2 글자수 : "+str2.length());
		
		System.out.println("str1 d의 글자위치 : "+str1.indexOf('d'));
		System.out.println("str2 D의 글자위치 : "+str2.indexOf('D'));
		
		System.out.println("str1 모두소문자로 : "+str1.toLowerCase());
		System.out.println("str2 모두소문자로 : "+str2.toLowerCase());
		
		System.out.println("str1 모두대문자로 : "+str1.toUpperCase());
		System.out.println("str2 모두대문자로 : "+str2.toUpperCase());
		
		
		
		
		
	}

}

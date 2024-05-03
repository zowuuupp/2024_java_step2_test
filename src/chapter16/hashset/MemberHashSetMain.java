package chapter16.hashset;

import java.util.HashSet;
import java.util.Set;

import chapter16.arraylist.Member;

public class MemberHashSetMain {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member(30,"홍길동"));
		set.add(new Member(30,"홍길동")); //원래 저장되면 안 됨. 물리적 주소랑 논리적 주소가 같아야 한다?
		
		//String Integer는 이미 되어있다. 그래서 다른거는 오버라이딩을 해서 맞춘다.
		
		System.out.println("총 객체수: "+set.size());
		System.out.println(set);
		
		
		
		
	}

}

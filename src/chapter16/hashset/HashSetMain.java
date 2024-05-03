package chapter16.hashset;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		//String type => 중복과 정렬이 안됨.
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add(new String("임정민"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연희"));
		hashSet.add(new String("강수진"));
		
		System.out.println(hashSet);
		System.out.println("-------------------");
		hashSet.add(new String("강수진"));
		System.out.println(hashSet); //MemberLinkedListMain랑은 다르다. 중복이 안 된다.
		
		
		
		
		
	}

}

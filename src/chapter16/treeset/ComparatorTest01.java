package chapter16.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest01 {

	public static void main(String[] args) {
		//default로 오버라이딩 되어 있는 String/Integer에서는 자동 오름차순 정렬과 빠른 검색기능
		Set<String> set = new TreeSet<String>();
		
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
		
		
		
	}

}

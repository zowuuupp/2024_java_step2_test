package chapter16.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>(); //기본 : 오름차순
		
		treeSet.add("홍길동");
		treeSet.add("김길동");
		treeSet.add("이길동");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		
		
		
		
	}

}

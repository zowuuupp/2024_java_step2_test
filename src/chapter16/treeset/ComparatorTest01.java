package chapter16.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest01 {

	public static void main(String[] args) {
		//default�� �������̵� �Ǿ� �ִ� String/Integer������ �ڵ� �������� ���İ� ���� �˻����
		Set<String> set = new TreeSet<String>();
		
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
		
		
		
	}

}

package chapter16.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return (s1.compareTo(s2))*-1; // *-1�� �����°Ŵ�. ������ ���������� �ȴ�.
	}
	
}

public class ComparatorTest02 {

	public static void main(String[] args) {
		
		//Set<String> set = new TreeSet<String>(); //��������
		//��������
		Set<String> set = new TreeSet<String>(new MyCompare());
		
		set.add("aaa");
		set.add("ddd");
		set.add("ggg");
		set.add("bbb");
		
		System.out.println(set);
		
		
		
		
		
		
		
		
		
		
		
	}

}

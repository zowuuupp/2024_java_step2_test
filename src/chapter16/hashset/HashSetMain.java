package chapter16.hashset;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		//String type => �ߺ��� ������ �ȵ�.
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		
		System.out.println(hashSet);
		System.out.println("-------------------");
		hashSet.add(new String("������"));
		System.out.println(hashSet); //MemberLinkedListMain���� �ٸ���. �ߺ��� �� �ȴ�.
		
		
		
		
		
	}

}

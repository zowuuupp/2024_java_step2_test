package chapter16.hashset;

import java.util.HashSet;
import java.util.Set;

import chapter16.arraylist.Member;

public class MemberHashSetMain {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member(30,"ȫ�浿"));
		set.add(new Member(30,"ȫ�浿")); //���� ����Ǹ� �� ��. ������ �ּҶ� ���� �ּҰ� ���ƾ� �Ѵ�?
		
		//String Integer�� �̹� �Ǿ��ִ�. �׷��� �ٸ��Ŵ� �������̵��� �ؼ� �����.
		
		System.out.println("�� ��ü��: "+set.size());
		System.out.println(set);
		
		
		
		
	}

}

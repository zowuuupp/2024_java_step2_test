package chapter16.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private TreeSet<Member02> treeSet;
	
	//DI
	public MemberTreeSet() {
		treeSet=new TreeSet<Member02>(new Member02());
		//Comparator�� ���Ľ� new Member02()�� �ݵ�� ������ ���
	}
	
	//���� �ȿ� �Է�
	public void addMember(Member02 member) {
		treeSet.add(member);
	}
	
	//����
	
	public boolean removeMember(int memberId) {
		Iterator<Member02> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member02 member=ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}//while
		System.out.println("memberId"+"��(��) �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember(){
		for(Member02 member : treeSet){
			System.out.println(member);
		}
		System.out.println();
	}

}

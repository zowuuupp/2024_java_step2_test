package chapter16.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet03 {
	
	private TreeSet<Member03> treeSet;
	
	//DI
	public MemberTreeSet03() {
		treeSet=new TreeSet<Member03>();
		//treeSet=new TreeSet<Member02>(new Member02());
		//Comparator�� ���Ľ� new Member02()�� �ݵ�� ������ ���
	}
	
	//���� �ȿ� �Է�
	public void addMember(Member03 member) {
		treeSet.add(member);
	}
	
	//����
	
	public boolean removeMember(int memberId) {
		Iterator<Member03> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member03 member=ir.next();
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
		for(Member03 member : treeSet){
			System.out.println(member);
		}
		System.out.println();
	}

}

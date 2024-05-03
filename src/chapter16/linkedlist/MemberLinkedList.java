package chapter16.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import chapter16.arraylist.Member;

public class MemberLinkedList {
	
	private LinkedList<Member> linkedlist;
	
	//�����ڸ� ���� LinkedList��ü ����
	
	public MemberLinkedList() {
		linkedlist = new LinkedList<Member>();
	}
	
	//addMember��� �޼ҵ� ���� -> Member ��ü�� �Ű������� �Ͽ�
	
	public void addMember(Member member) {
		linkedlist.add(member);
	}
	
	//removeMember
	public boolean removeMember(int MemberId) { //MemberId => ����ڰ� �Է��� Id
		Iterator<Member> ir=linkedlist.iterator(); //DataBase
		
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=member.getMemberId(); //DataBase
			if(tempId==MemberId) {
				linkedlist.remove(member);
				return true;
			}
		}
		System.out.println(MemberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	//���
	public void showAllMember() {
		for(Member member : linkedlist) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}

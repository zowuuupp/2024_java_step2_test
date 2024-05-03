package chapter16.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import chapter16.arraylist.Member;

public class MemberLinkedList {
	
	private LinkedList<Member> linkedlist;
	
	//생성자를 통한 LinkedList객체 생성
	
	public MemberLinkedList() {
		linkedlist = new LinkedList<Member>();
	}
	
	//addMember라는 메소드 생성 -> Member 객체를 매개변수로 하여
	
	public void addMember(Member member) {
		linkedlist.add(member);
	}
	
	//removeMember
	public boolean removeMember(int MemberId) { //MemberId => 사용자가 입력한 Id
		Iterator<Member> ir=linkedlist.iterator(); //DataBase
		
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=member.getMemberId(); //DataBase
			if(tempId==MemberId) {
				linkedlist.remove(member);
				return true;
			}
		}
		System.out.println(MemberId+"가 존재하지 않습니다.");
		return false;
	}
	
	//출력
	public void showAllMember() {
		for(Member member : linkedlist) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}

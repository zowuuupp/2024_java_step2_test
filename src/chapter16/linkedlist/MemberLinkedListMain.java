package chapter16.linkedlist;

import chapter16.arraylist.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		
		//������ ���� �Է�(�ߺ� ����, ���� ����)
		MemberLinkedList mll = new MemberLinkedList();
		
		mll.addMember(new Member(1001,"�մ�1"));
		mll.addMember(new Member(1002,"�մ�2"));
		mll.addMember(new Member(1003,"�մ�3"));
		mll.addMember(new Member(1004,"�մ�4"));
		mll.addMember(new Member(1005,"�մ�5"));
		Member remove = new Member(1005,"�մ�5");
		mll.addMember(remove);
		mll.showAllMember();
		
		mll.removeMember(1005);
		
		mll.showAllMember();
		
	}

}

package chapter16.linkedlist;

import chapter16.arraylist.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		
		//ÆÀ¿øµé Á¤º¸ ÀÔ·Â(Áßº¹ ÀÎÁ¤, ¼ø¼­ ÀÎÁ¤)
		MemberLinkedList mll = new MemberLinkedList();
		
		mll.addMember(new Member(1001,"¼Õ´Ô1"));
		mll.addMember(new Member(1002,"¼Õ´Ô2"));
		mll.addMember(new Member(1003,"¼Õ´Ô3"));
		mll.addMember(new Member(1004,"¼Õ´Ô4"));
		mll.addMember(new Member(1005,"¼Õ´Ô5"));
		Member remove = new Member(1005,"¼Õ´Ô5");
		mll.addMember(remove);
		mll.showAllMember();
		
		mll.removeMember(1005);
		
		mll.showAllMember();
		
	}

}

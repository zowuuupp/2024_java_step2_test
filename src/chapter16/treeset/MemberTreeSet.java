package chapter16.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private TreeSet<Member02> treeSet;
	
	//DI
	public MemberTreeSet() {
		treeSet=new TreeSet<Member02>(new Member02());
		//Comparator로 정렬시 new Member02()를 반드시 생성자 명시
	}
	
	//가방 안에 입력
	public void addMember(Member02 member) {
		treeSet.add(member);
	}
	
	//삭제
	
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
		System.out.println("memberId"+"가(는) 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember(){
		for(Member02 member : treeSet){
			System.out.println(member);
		}
		System.out.println();
	}

}

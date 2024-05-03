package chapter16.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	//ArrayList 선언(arrayList)
	//private ArrayList<Member> arrayList = new ArrayList<Member>();
	private ArrayList<Member> arrayList; //private라서 이렇게 함.
	
	//생성자(DI)
	public MemberArrayList() {
		arrayList=new ArrayList<Member>(); //heap
	} //arrayList 의존성 주입!!!
	
	//메소드
	
	
	//저장 : arrayList에 add 하는 메소드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//삭제 : arrayList에 remove하는 메소드
	public boolean removeMember(int memberId) {
		Iterator<Member> it=arrayList.iterator();
		
		while(it.hasNext()) {//hasNext 가 다 판단
			Member member=it.next();//다음 요소를 가져옴
			int tempId=member.getMemberId();//멤버의 입력한 아이디가
			if(tempId==memberId) {//내가 찾고자 하는 아이디와 일치한다면
				arrayList.remove(member);//그 가방을 제거하라.
				return true;
			}
		}
		System.out.println(memberId+"가(는) 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	

}

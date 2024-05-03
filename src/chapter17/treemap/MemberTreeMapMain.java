package chapter17.treemap;

import chapter17.hashmap.Member2;

public class MemberTreeMapMain {

	public static void main(String[] args) {
		
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		//입력에 필요한 매개변수 객체 생성
		
		MemberTree memberLee= new MemberTree(1001,"이수근");
		MemberTree memberSon= new MemberTree(1004,"손흥민");
		MemberTree memberPark= new MemberTree(1003,"박지성");
		MemberTree memberHong= new MemberTree(1002,"홍길동");
		
		//입력
		memberTreeMap.addMember(memberHong);
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(new MemberTree(1005,"이민정"));
		memberTreeMap.addMember(new MemberTree(1005,"김민정"));
		
		//물리적 주소는 memberId로 했다. 그렇기에 중복이 막아진다.
		//순서는 안 지켜진다. 순서도 지키고 싶다면 treemap을 쓰자.
		memberTreeMap.showAllMember(); 
		
		memberTreeMap.removeMember(1002);
		memberTreeMap.showAllMember(); 
				
		
		
		
		

	}

}

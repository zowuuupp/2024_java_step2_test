package chapter17.hashmap;

public class MemberHashMapMain {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap=new MemberHashMap();
		
		//입력에 필요한 매개변수 객체 생성
		
		Member2 memberLee= new Member2(1001,"이수근");
		Member2 memberSon= new Member2(1004,"손흥민");
		Member2 memberPark= new Member2(1003,"박지성");
		Member2 memberHong= new Member2(1002,"홍길동");
		
		//입력
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(new Member2(1005,"이민정"));
		memberHashMap.addMember(new Member2(1005,"김민정"));
		
		//물리적 주소는 memberId로 했다. 그렇기에 중복이 막아진다.
		//순서는 안 지켜진다. 순서도 지키고 싶다면 treemap을 쓰자.
		memberHashMap.showAllMember(); 
		
		memberHashMap.removeMember(1002);
		memberHashMap.showAllMember(); 
		
		
	}

}

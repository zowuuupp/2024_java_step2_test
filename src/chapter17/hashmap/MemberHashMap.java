package chapter17.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	private HashMap<Integer, String> hashMap; //선언 만 함. 메모리 확보X
	
	public MemberHashMap() {
		hashMap=new HashMap<Integer, String>();//메모리 사용, 가방이름이 HashMap
	}
	
	//addMember
	public void addMember(Member2 member) {
	      
	      hashMap.put(member.getMemberId(), member.getMemberName()); //array계열은 add, map계열은 put.
	   }
	
	//removeMember
	public boolean removeMember(int memberId) {
        
        while(hashMap.containsKey(memberId)) { //찾는 memberId가 존재하는지 여부를 물어봄
           hashMap.remove(memberId);
              return true;
           }
        System.out.println(memberId+"가 존재하지 않습니다");
        return false;
    }
	
	//showAllMember
    public void showAllMember() {
       
       Iterator<Integer> ir=hashMap.keySet().iterator(); //순환구조로 변경
	      while(ir.hasNext()) {
	         int key=ir.next();
	         String member=hashMap.get(key);
	         System.out.println(member);
	      }
	      System.out.println();
   }

}

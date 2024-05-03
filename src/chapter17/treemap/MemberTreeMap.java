package chapter17.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import chapter17.hashmap.Member2;

public class MemberTreeMap {
	
	private TreeMap<Integer,String> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer,String>();
	}
	//addMember
	public void addMember(MemberTree member) {
	      
		treeMap.put(member.getMemberId(), member.getMemberName()); //array계열은 add, map계열은 put.
	   }
	
	//removeMember
    public boolean removeMember(int memberId) {
       
       while(treeMap.containsKey(memberId)) {
          treeMap.remove(memberId);
             return true;
          }
       System.out.println(memberId+"가 존재하지 않습니다");
       return false;
   }
   
   //showAllMember
    public void showAllMember() {
       
       Iterator<Integer> ir=treeMap.keySet().iterator(); //해당key만 가져오기
      while(ir.hasNext()) {
         int key=ir.next();
         String member=treeMap.get(key);
         System.out.println(member);
      }
      System.out.println();
   }
	

}

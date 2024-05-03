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
	      
		treeMap.put(member.getMemberId(), member.getMemberName()); //array�迭�� add, map�迭�� put.
	   }
	
	//removeMember
    public boolean removeMember(int memberId) {
       
       while(treeMap.containsKey(memberId)) {
          treeMap.remove(memberId);
             return true;
          }
       System.out.println(memberId+"�� �������� �ʽ��ϴ�");
       return false;
   }
   
   //showAllMember
    public void showAllMember() {
       
       Iterator<Integer> ir=treeMap.keySet().iterator(); //�ش�key�� ��������
      while(ir.hasNext()) {
         int key=ir.next();
         String member=treeMap.get(key);
         System.out.println(member);
      }
      System.out.println();
   }
	

}

package chapter16.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	//ArrayList ����(arrayList)
	//private ArrayList<Member> arrayList = new ArrayList<Member>();
	private ArrayList<Member> arrayList; //private�� �̷��� ��.
	
	//������(DI)
	public MemberArrayList() {
		arrayList=new ArrayList<Member>(); //heap
	} //arrayList ������ ����!!!
	
	//�޼ҵ�
	
	
	//���� : arrayList�� add �ϴ� �޼ҵ�
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//���� : arrayList�� remove�ϴ� �޼ҵ�
	public boolean removeMember(int memberId) {
		Iterator<Member> it=arrayList.iterator();
		
		while(it.hasNext()) {//hasNext �� �� �Ǵ�
			Member member=it.next();//���� ��Ҹ� ������
			int tempId=member.getMemberId();//����� �Է��� ���̵�
			if(tempId==memberId) {//���� ã���� �ϴ� ���̵�� ��ġ�Ѵٸ�
				arrayList.remove(member);//�� ������ �����϶�.
				return true;
			}
		}
		System.out.println(memberId+"��(��) �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	

}

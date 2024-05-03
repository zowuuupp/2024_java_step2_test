package chapter16.treeset;

import java.util.Comparator;

public class Member02 implements Comparator<Member02>{
	
	private int memberId;
	private String memberName;
	
	public Member02(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public Member02() {
		// TODO Auto-generated constructor stub
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}

	@Override
	public int compare(Member02 member1, Member02 member2) {
		return (member1.memberId - member2.memberId);
		//return (member1.memberId - member2.memberId)*-1; �̰� ��������
	}
	
	
	//MemberHashSetMain���� �ͼ� �Է�.
	//������ �ּ�
	@Override
	public int hashCode() {
		return memberName.hashCode()+memberId;
	}
	
	//���� �ּ�
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member02) {
			Member02 member = (Member02)obj;
			return member.memberName.equals(memberName) && member.memberId==memberId;
		}else {
			return false;
		}
	}
	

	
	
	
	

}

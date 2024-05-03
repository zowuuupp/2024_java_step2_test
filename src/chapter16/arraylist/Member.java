package chapter16.arraylist;

import java.util.Objects;

public class Member {
	
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
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
	
	
	//MemberHashSetMain���� �ͼ� �Է�.
	//������ �ּ�
	@Override
	public int hashCode() {
		return memberName.hashCode()+memberId;
	}
	
	//���� �ּ�
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.memberName.equals(memberName) && member.memberId==memberId;
		}else {
			return false;
		}
	}

	
	
	
	

}

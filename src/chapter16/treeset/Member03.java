package chapter16.treeset;

public class Member03 implements Comparable<Member03>{
	
	private int memberId;
	private String memberName;
	
	public Member03() {
		// TODO Auto-generated constructor stub
	}
	
	public Member03(int memberId, String memberName) {
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

	
	@Override
	public int compareTo(Member03 member3) {
		// TODO Auto-generated method stub
		return (this.memberId - member3.memberId);
	}
	
	
	
	//MemberHashSetMain俊辑 客辑 涝仿.
	//拱府利 林家
	@Override
	public int hashCode() {
		return memberName.hashCode()+memberId;
	}
	
	//稠府利 林家
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member03) {
			Member03 member = (Member03)obj;
			return member.memberName.equals(memberName) && member.memberId==memberId;
		}else {
			return false;
		}
	}


	
	
	
	

}

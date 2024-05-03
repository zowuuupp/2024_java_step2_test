package chapter17.treemap;

public class MemberTree implements Comparable<MemberTree>{
	
	private int memberId;
	   private String memberName;
	   
	   public MemberTree() {
	      // TODO Auto-generated constructor stub
	   }
	   
	   public MemberTree(int memberId, String memberName) {
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
	
	   //물리적 값
	   @Override
	   public int hashCode() {
	            return memberId;
	   }   
	   
	   //논리적인 값
	   @Override
	   public boolean equals(Object obj) {
	      if(obj instanceof MemberTree) {
	    	  MemberTree member=(MemberTree)obj;
	         if(this.memberId == member.memberId) {
	            return true;
	         }
	      }
	      return false;
	   } 
	   
	   
	   
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName +"회원님의 아이디는 "+memberId+"입니다.";
	}

	@Override
	public int compareTo(MemberTree o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}

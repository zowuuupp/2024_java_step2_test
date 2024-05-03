package chapter16.arraylist;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList=new MemberArrayList();
		
		Member memberLee=new Member(1001, "ÀÌÁö¿ø");
		Member memberSon=new Member(1002, "¼Õ¹Î±¹");
		Member memberKim=new Member(1003, "±èµµ±Õ");
		Member memberPark=new Member(1004, "¹ÚÁØ¿µ");
		Member memberMin=new Member(1005, "¹Î½Â±â");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberMin);
		memberArrayList.addMember(memberPark);
		
		memberArrayList.showAllMember();
		System.out.println("----------------------------");
		memberArrayList.removeMember(1002);
		memberArrayList.removeMember(1006);
		
		memberArrayList.showAllMember();
		
		
	}

}

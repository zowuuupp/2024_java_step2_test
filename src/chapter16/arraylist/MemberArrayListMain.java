package chapter16.arraylist;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList=new MemberArrayList();
		
		Member memberLee=new Member(1001, "������");
		Member memberSon=new Member(1002, "�չα�");
		Member memberKim=new Member(1003, "�赵��");
		Member memberPark=new Member(1004, "���ؿ�");
		Member memberMin=new Member(1005, "�ν±�");
		
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

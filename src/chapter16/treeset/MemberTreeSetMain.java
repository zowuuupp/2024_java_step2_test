package chapter16.treeset;

import java.util.TreeSet;

public class MemberTreeSetMain {

	public static void main(String[] args) {
		
		MemberTreeSet mt2 = new MemberTreeSet();
		
		mt2.addMember(new Member02(1001,"ȫ�浿"));
		mt2.addMember(new Member02(1002,"��浿"));
		mt2.addMember(new Member02(1003,"�̱浿"));
		mt2.addMember(new Member02(1004,"�ڱ浿"));
		mt2.addMember(new Member02(1004,"�۱浿"));
		
		mt2.showAllMember();
		
		MemberTreeSet03 mt3 = new MemberTreeSet03();
		
		mt3.addMember(new Member03(1001,"ȫ�浿"));
		mt3.addMember(new Member03(1002,"��浿"));
		mt3.addMember(new Member03(1003,"�̱浿"));
		mt3.addMember(new Member03(1004,"�ڱ浿"));
		mt3.addMember(new Member03(1004,"�۱浿"));
		
		mt3.showAllMember();
		
	}

}

package chapter16.treeset;

import java.util.TreeSet;

public class MemberTreeSetMain {

	public static void main(String[] args) {
		
		MemberTreeSet mt2 = new MemberTreeSet();
		
		mt2.addMember(new Member02(1001,"홍길동"));
		mt2.addMember(new Member02(1002,"김길동"));
		mt2.addMember(new Member02(1003,"이길동"));
		mt2.addMember(new Member02(1004,"박길동"));
		mt2.addMember(new Member02(1004,"송길동"));
		
		mt2.showAllMember();
		
		MemberTreeSet03 mt3 = new MemberTreeSet03();
		
		mt3.addMember(new Member03(1001,"홍길동"));
		mt3.addMember(new Member03(1002,"김길동"));
		mt3.addMember(new Member03(1003,"이길동"));
		mt3.addMember(new Member03(1004,"박길동"));
		mt3.addMember(new Member03(1004,"송길동"));
		
		mt3.showAllMember();
		
	}

}

package chapter16.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// ArrayList생성(단, UserInfo 객체만 들어갈 수 있음) , 객체이름 : arr
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		
		/* 내가 하다가 못 푼거.
		while(true) {
			System.out.print("아이디 생성 : ");
			Scanner sc=new Scanner(System.in);
			
			//아이디 생성을 UserInfo에 객체를 이용하여 setId로 추가
			UserInfo newUser = new UserInfo();
			newUser.setId(sc.next());
			arr.add(newUser);
			//아이디 중복체크
			
			for(UserInfo U : arr) {
				if (U.getId().equals(U.getId())) {
					return;
				} else {
					//중복된 아이디가 아니라면 pwd입력 받기
					int pwd = sc.nextInt();
					user.setPwd(pwd);
				}
			}	
			
			//arr에 정상적인 회원정보 출력
		}
		*/
		
		/*선생님
outer: while (true) {
            
	       System.out.print("아이디 생성(end을 입력하면 종료) : ");
	       Scanner sc = new Scanner(System.in);

	       UserInfo ui = new UserInfo();
	       ui.setId(sc.next());
	         
	       //종료
	          if(ui.getId().equals("end")) {
	             System.out.println("프로그램이 종료됩니다.");
	             break;
	          }
	          
	       // 아이디 중복 체크
	       for (int i = 0; i < arr.size(); i++) {
	          if (ui.getId().equals(arr.get(i).getId())) {
	             System.out.println("아이디가 중복됩니다. 다른 아이디를 입력하세요");
	             continue outer;
	          }
	       }
	       // 중복된 아이디가 아니라면 pwd입력
	       System.out.print("패스워드를 입력하세요 : ");
	       Scanner sc2 = new Scanner(System.in);
	       ui.setPwd(sc2.nextInt());
	       arr.add(ui);
	       for (int i = 0; i < arr.size(); i++) {
	    	   System.out.println(arr.get(i).getId());
	    	   System.out.println(arr.get(i).getPwd());
	    	   System.out.println("-----------------------");
	       }
	  }
	  */
		
		/* 다른 사람꺼
		while(true) {
			Scanner sc = new Scanner(System.in);
	         // 아이디 생성을 UserInfo에 객체를 이용하여 setId로 추가
	        UserInfo newUser = new UserInfo();
	         
	            // 아이디 중복 체크
	        boolean run = true;
	        do {
	           System.out.println();
	           System.out.print("아이디 생성 : ");
	           String inputId = sc.next();
	           if (arr.size()==0) {
	              run = false;
	           } else {
	              for (UserInfo user : arr) {
	                 if ( ! ( user.getId().equals(inputId) )) { // 
	                    run = false;
	                 } else {
	                    System.out.println("중복된 아이디입니다.");
	                 } // 내부 if
	              } // for
	           } // 외부 if
	           newUser.setId( inputId );
	        } while (run);
	         

	            // 중복된 아이디가 아니라면 pwd 입력 받기
	         System.out.print("비번 입력 : ");
	         newUser.setPwd( Integer.parseInt(sc.next()) );
	            // arr에 정상적인 회원정보 출력
	         System.out.println();
	         System.out.println("새로운 회원의 아이디 : "+newUser.getId() );
	         System.out.println("새로운 회원의 비번 : "+newUser.getPwd() );
	         // 회원 추가
	         arr.add(newUser);
	      } // while		
		   */
		
		
		/*
		      Scanner sc = new Scanner(System.in);
		      ArrayList<UserInfo> userArrList = new ArrayList<>();

		      DuplicateId: while (true) {
		         System.out.println("[회원가입] 종료 - end");

		         String id, pw;

		         System.out.print("아이디 : ");
		         id = sc.nextLine();

		         if (id.toLowerCase().equals("end")) {
		            System.out.println("종료.");
		            break;
		         }

		         for (var user : userArrList) {
		            if (user.duplicateIdCheck(id)) {
		               System.out.println("아이디 중복 !");
		               continue DuplicateId;
		            }
		         }

		         System.out.print("비밀번호 : ");
		         pw = sc.nextLine();

		         userArrList.add(new UserInfo(id, pw));

		         System.out.println("=====[User Info]=====");
		         for (var user : userArrList) {
		            user.printInfo();
		         }

		      } // while

		   } // main
		*/
	
		
		
		/* 1. 아이디 입력 : Scanner */
        /* 2. 아이디 중복 체크 (중복일 경우 다시 입력) : String.equals() */
        /* 3. 비밀 번호 입력 : Scanner */
        /* 4. UserInfo 생성 : ArrayList 에 입력받은 아이디, 비밀번호 의 UserInfo 추가 */
        /* 5. 회원 정보 출력 : UserInfo 에 get() 메서드 */
		
		
		
		
		
		
		
		
	}
	
			
			
			
			
	
		
		
}
	


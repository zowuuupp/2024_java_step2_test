package chapter16.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// ArrayList����(��, UserInfo ��ü�� �� �� ����) , ��ü�̸� : arr
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		
		/* ���� �ϴٰ� �� Ǭ��.
		while(true) {
			System.out.print("���̵� ���� : ");
			Scanner sc=new Scanner(System.in);
			
			//���̵� ������ UserInfo�� ��ü�� �̿��Ͽ� setId�� �߰�
			UserInfo newUser = new UserInfo();
			newUser.setId(sc.next());
			arr.add(newUser);
			//���̵� �ߺ�üũ
			
			for(UserInfo U : arr) {
				if (U.getId().equals(U.getId())) {
					return;
				} else {
					//�ߺ��� ���̵� �ƴ϶�� pwd�Է� �ޱ�
					int pwd = sc.nextInt();
					user.setPwd(pwd);
				}
			}	
			
			//arr�� �������� ȸ������ ���
		}
		*/
		
		/*������
outer: while (true) {
            
	       System.out.print("���̵� ����(end�� �Է��ϸ� ����) : ");
	       Scanner sc = new Scanner(System.in);

	       UserInfo ui = new UserInfo();
	       ui.setId(sc.next());
	         
	       //����
	          if(ui.getId().equals("end")) {
	             System.out.println("���α׷��� ����˴ϴ�.");
	             break;
	          }
	          
	       // ���̵� �ߺ� üũ
	       for (int i = 0; i < arr.size(); i++) {
	          if (ui.getId().equals(arr.get(i).getId())) {
	             System.out.println("���̵� �ߺ��˴ϴ�. �ٸ� ���̵� �Է��ϼ���");
	             continue outer;
	          }
	       }
	       // �ߺ��� ���̵� �ƴ϶�� pwd�Է�
	       System.out.print("�н����带 �Է��ϼ��� : ");
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
		
		/* �ٸ� �����
		while(true) {
			Scanner sc = new Scanner(System.in);
	         // ���̵� ������ UserInfo�� ��ü�� �̿��Ͽ� setId�� �߰�
	        UserInfo newUser = new UserInfo();
	         
	            // ���̵� �ߺ� üũ
	        boolean run = true;
	        do {
	           System.out.println();
	           System.out.print("���̵� ���� : ");
	           String inputId = sc.next();
	           if (arr.size()==0) {
	              run = false;
	           } else {
	              for (UserInfo user : arr) {
	                 if ( ! ( user.getId().equals(inputId) )) { // 
	                    run = false;
	                 } else {
	                    System.out.println("�ߺ��� ���̵��Դϴ�.");
	                 } // ���� if
	              } // for
	           } // �ܺ� if
	           newUser.setId( inputId );
	        } while (run);
	         

	            // �ߺ��� ���̵� �ƴ϶�� pwd �Է� �ޱ�
	         System.out.print("��� �Է� : ");
	         newUser.setPwd( Integer.parseInt(sc.next()) );
	            // arr�� �������� ȸ������ ���
	         System.out.println();
	         System.out.println("���ο� ȸ���� ���̵� : "+newUser.getId() );
	         System.out.println("���ο� ȸ���� ��� : "+newUser.getPwd() );
	         // ȸ�� �߰�
	         arr.add(newUser);
	      } // while		
		   */
		
		
		/*
		      Scanner sc = new Scanner(System.in);
		      ArrayList<UserInfo> userArrList = new ArrayList<>();

		      DuplicateId: while (true) {
		         System.out.println("[ȸ������] ���� - end");

		         String id, pw;

		         System.out.print("���̵� : ");
		         id = sc.nextLine();

		         if (id.toLowerCase().equals("end")) {
		            System.out.println("����.");
		            break;
		         }

		         for (var user : userArrList) {
		            if (user.duplicateIdCheck(id)) {
		               System.out.println("���̵� �ߺ� !");
		               continue DuplicateId;
		            }
		         }

		         System.out.print("��й�ȣ : ");
		         pw = sc.nextLine();

		         userArrList.add(new UserInfo(id, pw));

		         System.out.println("=====[User Info]=====");
		         for (var user : userArrList) {
		            user.printInfo();
		         }

		      } // while

		   } // main
		*/
	
		
		
		/* 1. ���̵� �Է� : Scanner */
        /* 2. ���̵� �ߺ� üũ (�ߺ��� ��� �ٽ� �Է�) : String.equals() */
        /* 3. ��� ��ȣ �Է� : Scanner */
        /* 4. UserInfo ���� : ArrayList �� �Է¹��� ���̵�, ��й�ȣ �� UserInfo �߰� */
        /* 5. ȸ�� ���� ��� : UserInfo �� get() �޼��� */
		
		
		
		
		
		
		
		
	}
	
			
			
			
			
	
		
		
}
	


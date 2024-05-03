package chapter16.arraylist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonManager {
	
	public void personMgr() {
		try(Scanner scan = new Scanner(System.in)) {
			
			ArrayList<Person> pArr = new ArrayList<Person>();
			
	WHILE : while(true) { //4�� �Ҷ� WHILE�� ���ͼ� ����?
				System.out.println("1. ȸ���߰�");
				System.out.println("2. ȸ��Ż��");
				System.out.println("3. ȸ������");
				System.out.println("4. ����");
				System.out.print("�׸��� : ");
				
				int select;
				try {
					select=scan.nextInt();
				} catch (InputMismatchException e) {
					select=-1; //������ ���ܻ�Ȳ���� ���� ������ ����
				}
				
				switch (select) {
				case 1 :
					addPerson(scan,pArr);
					break;
				case 2 :
					removePerson(scan,pArr);
					break;
				case 3 :
					showPerson(pArr);
					break;
				case 4 :
					System.out.println("���α׷��� ���� �˴ϴ�.");
					break WHILE;
				default :
					System.out.println("�߸��� �Է� ���Դϴ�");
				}//switch
			}
		} catch (Exception e) {
			System.out.println("������ ����");
			System.out.println(e);
		}
	}
	
	//===========================================================
	private void addPerson(Scanner scan, ArrayList<Person> pArr) {
		System.out.println("----�����߰�----");
		System.out.println("�̸� : ");
		String name=scan.next();
		
		System.out.println("���� : ");
		int age=scan.nextInt();
		
		System.out.println("��ȭ : ");
		String tel =scan.next();
		
		pArr.add(new Person(name, age, tel));
		
	}
	
	private void removePerson(Scanner scan,ArrayList<Person> pArr) { //ȸ�� ������ ������ ���̴�. �ٵ� ������ �� �ߴµ�? ������ ����� �ִ�.
		System.out.println("----ȸ��Ż��----");
		if(pArr.isEmpty()) {
			System.out.println("��ϵ� ȸ���� �����ϴ�.");
			return;
		}
		
		System.out.print("Ż���� ȸ����ȣ�� �Է��ϼ���(1 ~ "+pArr.size()+") : ");
		int index=scan.nextInt();
		
		pArr.remove(index-1);
		
	}
	
	private void showPerson(ArrayList<Person> pArr) {
		System.out.println("----ȸ������----");
		
		int i=1;
		for (var p : pArr) { //var�� �˾Ƽ� �°� ����ش�. ���⼭�� Person
			System.out.println(i+".�̸� : "+p.getName());
			System.out.println(i+".���� : "+p.getAge());
			System.out.println(i+".��ȭ : "+p.getTel());
			System.out.println();
			
		}
		
	}
	
}

package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �� : ");
		int n= scan.nextInt();
		
		//�ʱ�ȭ�� ���ؼ� �޸� Ȯ�� �� ������(Guide�� ��ü)
		Guide guide = new Guide(n);
		
		//������ ���
		System.out.println("������ ���");
		for(int i=0;i<n;i++) {
			String name=scan.next();
			System.out.println((i+1)+". �̸�: ");
			guide.guest[i].setName(name);
			String gender=scan.next();
			System.out.println((i+1)+". ����: ");
			guide.guest[i].setGender(gender);
			
outer:	while(true) {
				System.out.println("1. ������ ����");
				System.out.println("2. ������ ����");
				System.out.println("3. ����");
				System.out.println("����>>");
				
				int select=scan.nextInt();
				
				switch (select) {
				case 1 : 
					for (i=0;i<n;i++) {
						System.out.println((i+1)+". �̸�: "+guide.guest[i].getName());
						System.out.println((i+1)+". ����: "+guide.guest[i].getGender());
						System.out.println((i+1)+". ������: "+guide.getPoint());
					}
					break;
				case 2 :
					System.out.print("���� �����Ͻðڽ��ϱ�?: ");
					Guide.point=scan.next();
					System.out.println(Guide.point+"�� �������� �����");
					System.out.println("==========================");
					break;
				case 3 : 
					System.out.println("����");
					break outer;
				default:
					
					break;
				}//switch
				
				
			}//while
			
		}
		
		
	}

}

/*
����ƽ ���� point�� ������ GuideŬ������ �����, 
�̸��� ���� ������ ���� Guest Ŭ������ ����� �Ʒ��� ����� �������� �ϴ� ������ ����
���� ����� ����� ������ ���� ����.
������ �� ��ŭ GuestŬ������ �迭�� ����ddddddddddddddddddddddddddddddddddddddddddddddddddddddqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqd

��� : 

	������ �� : 2 (����ڰ� �Է�)
	������ ���
	1. �̸� : ȫ�浿
	1. ���� : ��
	--------------------------
	2. �̸� : ȫ���
	2. ���� : ��
	
	1. ������ ����
	2. ������ ����
	3. ����
	
	���� >> 1
	1. �̸� : ȫ�浿
	1. ���� : ��
	1. ������ : ���ŵ�
	--------------------------------------
	2. �̸� : ȫ���
	2. ���� : ��
	2. ������ : ���ŵ�
	========================================
	1. ������ ����
	2. ������ ����
	3. ����
	
	���� >> 2	
	���
	���� >> 2	
	���� �����Ͻðڽ��ϱ� : ���̵�
	���̵��� ������ ����
========================================
	1. ������ ����
	2. ������ ����
	3. ����
	���� >> 3
	����
*/












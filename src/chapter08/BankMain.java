package chapter08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {
		
		Bank bk1 = new Bank("������","010-xxxx-xxxx");
		Bank.interest=5.3f;
		bk1.getBank();
		
		System.out.println("===============================");
		
		Bank bk2 = new Bank("�ϻ���","010-yyyy-yyyy");
		bk2.getBank(); // ���� 5.3�̴�. static�̴�.
		
		String point=null;
		String tel=null;
		
		Scanner s=new Scanner(System.in);
		
		point=JOptionPane.showInputDialog("������");
		tel=JOptionPane.showInputDialog("��ȭ��ȣ");
		
		Bank bank=new Bank(point,tel);
		System.out.print(point+"������ ���������� ���ڸ� �Է��ϼ���: ");
		bank.interest=s.nextFloat();
		System.out.println("===============================");
		bank.getBank();
		
		
		
		
	}

}

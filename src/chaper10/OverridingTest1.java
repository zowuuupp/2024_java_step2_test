package chaper10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest1 { //�����ð� ����

	public static void main(String[] args) {
		
		Customer customerLee = new Customer (10001,"���");
		customerLee.bonusPoint=5000;
		System.out.println(customerLee.showCustomer());
		
		
		VIPCustomer VIPCustomerKim= new VIPCustomer(2000,"�̼���",10000);
		VIPCustomerKim.bonusPoint=10000;
		System.out.println();
		System.out.println(VIPCustomerKim.showCustomer());
		System.out.println();
		int price=10000;
		System.out.println(customerLee.getCustomerName()+"���� "+customerLee.calcPrice(price)+"���� ���� �Ϸ��Ͽ����ϴ�.");
		System.out.println(VIPCustomerKim.getCustomerName()+"���� "+VIPCustomerKim.calcPrice(price)+"���� ���� �Ϸ��Ͽ����ϴ�.");
		
		
		
	}

}

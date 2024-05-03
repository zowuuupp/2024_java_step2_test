package chaper10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest1 { //저번시간 복습

	public static void main(String[] args) {
		
		Customer customerLee = new Customer (10001,"장민");
		customerLee.bonusPoint=5000;
		System.out.println(customerLee.showCustomer());
		
		
		VIPCustomer VIPCustomerKim= new VIPCustomer(2000,"이석준",10000);
		VIPCustomerKim.bonusPoint=10000;
		System.out.println();
		System.out.println(VIPCustomerKim.showCustomer());
		System.out.println();
		int price=10000;
		System.out.println(customerLee.getCustomerName()+"님이 "+customerLee.calcPrice(price)+"원을 지불 완료하였습니다.");
		System.out.println(VIPCustomerKim.getCustomerName()+"님이 "+VIPCustomerKim.calcPrice(price)+"원을 지불 완료하였습니다.");
		
		
		
	}

}

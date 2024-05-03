package chaper10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		//부모=자식(자동형 변환) , 되게 많이 쓴다.
		Customer vc = new VIPCustomer(10003, "김치", 10000);
		System.out.println(vc.showCustomer());
		
		
		
		
		
	}

}

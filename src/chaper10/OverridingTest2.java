package chaper10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		//�θ�=�ڽ�(�ڵ��� ��ȯ) , �ǰ� ���� ����.
		Customer vc = new VIPCustomer(10003, "��ġ", 10000);
		System.out.println(vc.showCustomer());
		
		
		
		
		
	}

}

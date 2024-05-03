package chapter09;

public class CustomerMain {

	public static void main(String[] args) {

		System.out.println("-----일반고객-----");
		// 방법1
		int price = 10000;
		Customer cs1 = new Customer();
		cs1.setCustomerName("김성웅");
		System.out.println(cs1.getCustomerName() + "님이 " + cs1.calcPrice(price) + "원을 지불 완료하였습니다.");
		System.out.println(cs1.showCustomer());
		// 방법2
		System.out.println("---------------------------------------");
		price = 24000;
		Customer cs2 = new Customer(1234, "이석준");
		System.out.println(cs2.customerName + "님은 " + cs2.calcPrice(price) + "원을 지불하였습니다.");
		System.out.println(cs2.showCustomer());

		System.out.println("-----VIP-----");
		price = 540000;
		VIPCustomer csvip = new VIPCustomer(1234, "이석준2", 9090);
		int vipprice=csvip.calcPrice(price);
		System.out.println(csvip.customerName + "님은 " + vipprice + "원을 지불하였습니다.");
		System.out.println(csvip.showCustomer());

	}

}

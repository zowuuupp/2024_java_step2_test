package chapter09;

public class CustomerMain {

	public static void main(String[] args) {

		System.out.println("-----�Ϲݰ�-----");
		// ���1
		int price = 10000;
		Customer cs1 = new Customer();
		cs1.setCustomerName("�輺��");
		System.out.println(cs1.getCustomerName() + "���� " + cs1.calcPrice(price) + "���� ���� �Ϸ��Ͽ����ϴ�.");
		System.out.println(cs1.showCustomer());
		// ���2
		System.out.println("---------------------------------------");
		price = 24000;
		Customer cs2 = new Customer(1234, "�̼���");
		System.out.println(cs2.customerName + "���� " + cs2.calcPrice(price) + "���� �����Ͽ����ϴ�.");
		System.out.println(cs2.showCustomer());

		System.out.println("-----VIP-----");
		price = 540000;
		VIPCustomer csvip = new VIPCustomer(1234, "�̼���2", 9090);
		int vipprice=csvip.calcPrice(price);
		System.out.println(csvip.customerName + "���� " + vipprice + "���� �����Ͽ����ϴ�.");
		System.out.println(csvip.showCustomer());

	}

}

package chapter12.MultiInterface;

public class CumtomerMain {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		System.out.println("-----Buy-----");
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		System.out.println("-----Sell-----");
		Sell seller = customer; //������
		seller.sell();
		seller.sellorder();
		
		if (seller instanceof Customer) {
			Customer customer2 = (Customer)seller;//������� ����ȯ,������ ����� ��.�ٿ�ĳ����
			System.out.println("Down Chasting");
			customer2.buy(); //Customer
			customer2.sell(); //sell
			customer2.sellorder();
			
		}
		
		
		
	}

}

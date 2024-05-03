package chapter12.MultiInterface;

public class CumtomerMain {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		System.out.println("-----Buy-----");
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		System.out.println("-----Sell-----");
		Sell seller = customer; //교집합
		seller.sell();
		seller.sellorder();
		
		if (seller instanceof Customer) {
			Customer customer2 = (Customer)seller;//명시적인 형변환,억지로 만드는 것.다운캐스팅
			System.out.println("Down Chasting");
			customer2.buy(); //Customer
			customer2.sell(); //sell
			customer2.sellorder();
			
		}
		
		
		
	}

}

package chapter09;
	
public class VIPCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	// VIPCustomer의 생성자를 오버로딩하여
	// Customer의 int customerID, String customerName을 초기화하고
	// agentID도 초기화 하는 생성자를 구현하시오.
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // 상관은 없지만 이거를 안 쓰면 위의 SILVER와 0.05가 없다.
										// 여기서는 이거를 해서 VIP 등급이랑 적립비율이 손해를 보고 있다.
		customerGrade = "VIP";
		bonusRatio = 0.1; // 다시 비율과 등급을 설정해준다.
		this.agentID = agentID; // 전문 상담전화를 위한것
		saleRatio = 0.15;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	//포인트 적립
	@Override
	public int calcPrice(int price) {
		//세일된 가격의 10%
		bonusPoint+=price*(1-saleRatio) * bonusRatio;
		return price-(int)(price*saleRatio); //물건 가격
	}
	
	@Override
	public String showCustomer() {
		return super.showCustomer()+"\n전문 상담원은 "+agentID+"입니다.";
	}
	
	
	
	
	
}

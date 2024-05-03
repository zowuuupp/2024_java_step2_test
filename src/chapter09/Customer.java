package chapter09;

public class Customer {

	// 멤버변수
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	public double bonusPoint;
	protected double bonusRatio;

	// 기본생성자
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.05;
		System.out.println("Customer() 생성자 호출");
	}

	// customerID, customerName를 초기화 하는 생성자
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.05;
	}

	// 가격에 대한 5%의 포인트(가격(price)의 5%를 bonusPoint에 저장하고 가격을 반환)
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	//getter & setter
	public String showCustomer() {
		return customerName + "님의 등급은 " + customerGrade + "이며 보너스 포인트는 " + bonusPoint + "원 입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

}

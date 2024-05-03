package chapter09;

public class Customer {

	// �������
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	public double bonusPoint;
	protected double bonusRatio;

	// �⺻������
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.05;
		System.out.println("Customer() ������ ȣ��");
	}

	// customerID, customerName�� �ʱ�ȭ �ϴ� ������
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.05;
	}

	// ���ݿ� ���� 5%�� ����Ʈ(����(price)�� 5%�� bonusPoint�� �����ϰ� ������ ��ȯ)
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	//getter & setter
	public String showCustomer() {
		return customerName + "���� ����� " + customerGrade + "�̸� ���ʽ� ����Ʈ�� " + bonusPoint + "�� �Դϴ�.";
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

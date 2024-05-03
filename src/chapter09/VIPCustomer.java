package chapter09;
	
public class VIPCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	// VIPCustomer�� �����ڸ� �����ε��Ͽ�
	// Customer�� int customerID, String customerName�� �ʱ�ȭ�ϰ�
	// agentID�� �ʱ�ȭ �ϴ� �����ڸ� �����Ͻÿ�.
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // ����� ������ �̰Ÿ� �� ���� ���� SILVER�� 0.05�� ����.
										// ���⼭�� �̰Ÿ� �ؼ� VIP ����̶� ���������� ���ظ� ���� �ִ�.
		customerGrade = "VIP";
		bonusRatio = 0.1; // �ٽ� ������ ����� �������ش�.
		this.agentID = agentID; // ���� �����ȭ�� ���Ѱ�
		saleRatio = 0.15;
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	//����Ʈ ����
	@Override
	public int calcPrice(int price) {
		//���ϵ� ������ 10%
		bonusPoint+=price*(1-saleRatio) * bonusRatio;
		return price-(int)(price*saleRatio); //���� ����
	}
	
	@Override
	public String showCustomer() {
		return super.showCustomer()+"\n���� ������ "+agentID+"�Դϴ�.";
	}
	
	
	
	
	
}

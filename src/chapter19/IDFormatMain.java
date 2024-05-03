package chapter19;

public class IDFormatMain {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		
		if(userID == null) {
			throw new IDFormatException("���̵�� null�� �� �����ϴ�.");
		}else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("���̵�� 8���� �̻��̰ų� 20�� ���Ϸ� ������");
		}
		
		this.userID = userID;//�������� ���̵�
	}

	//==================================================================
	public static void main(String[] args) {
		
		IDFormatMain test = new IDFormatMain();
		
		/*
		String userID=null;
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {//����� ���� �޼���
			System.out.println(e); //�ڵ�� �޼���
			System.out.println(e.getMessage()); //�޼���
		}
		*/
		
		String userID="1234567";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {//����� ���� �޼���
			System.out.println(e); //�ڵ�� �޼���
			System.out.println(e.getMessage()); //�޼���
		}
		
		
		
	}

}

package chapter12.MultiInterface;

public interface Sell {
	
	void sell();
	
	/*
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
	*/
	
	default void sellorder() {
		System.out.println("�Ǹ� �ֹ�");
	}
	
	
	
	
	

}

package chapter12.MultiInterface;

public interface Buy {
	
	void buy();
	
	//자바 8
	default void order() {
		System.out.println("구매 주문");
	}
	
	
	
	
	

}

package chapter12.MultiInterface;

public interface Buy {
	
	void buy();
	
	//�ڹ� 8
	default void order() {
		System.out.println("���� �ֹ�");
	}
	
	
	
	
	

}

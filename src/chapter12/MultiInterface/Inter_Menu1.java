package chapter12.MultiInterface;

public interface Inter_Menu1 {
	
	abstract String jajang();
	String jjambong();
	
	default void show() {
		System.out.println("¸ÀÁý~~");
	}

}

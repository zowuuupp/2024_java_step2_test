package chapter11;

public class Spider extends Animal{
	public Spider() {
		this.kind = "절지동물";
	}

	@Override
	public void sound() {
		System.out.println("크에에엑");
	}
}

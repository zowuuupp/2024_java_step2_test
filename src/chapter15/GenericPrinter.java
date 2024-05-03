package chapter15;

public class GenericPrinter<T extends Material> { //Material 타입도 호환을 하겠다.

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	
	
	
	
	
	

}

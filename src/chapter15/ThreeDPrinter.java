package chapter15;

public class ThreeDPrinter {

	private Object material;

	// 출력
	public Object getMaterial() {
		return material;
	}

	// 입력
	public void setMaterial(Object meterial) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "ThreeDPrinter [material=" + material + "]";
	}

}

package chaper10;

public class Computer extends Calculator {
	// double PI=3.14�� ����Ͽ� ���� ���̸� ���ϴ� areaCircle�� Override ����
	@Override
	double areaCircle(double r) {
		System.out.println("Computer �޼ҵ� areaCircle() ����");
		//double PI = 3.14;
		double area = r * r * Math.PI; // java length �� �ִ�.
		return area;
	}

}

package chaper10;

public class Computer extends Calculator {
	// double PI=3.14를 사용하여 원의 넓이를 구하는 areaCircle의 Override 구현
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 메소드 areaCircle() 실행");
		//double PI = 3.14;
		double area = r * r * Math.PI; // java length 에 있다.
		return area;
	}

}

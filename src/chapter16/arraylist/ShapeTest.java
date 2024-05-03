package chapter16.arraylist;

import java.util.ArrayList;
import java.util.List;

class Shape{
	
	void draw() {
		System.out.println("draw Shape");
	}
}

class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	void circle() {
		System.out.println("원모양 입니다.");
	}
}
class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}
	void Rectangle() {
		System.out.println("사각형 모양 입니다.");
	}
}
class Triangle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Triangle");
	}
	void Triangle() {
		System.out.println("세모 모양 입니다.");
	}
}

//===================================================
public class ShapeTest {
	
	ArrayList<Shape> sList=new ArrayList<Shape>();

	public static void main(String[] args) {
		
		ShapeTest sTest=new ShapeTest();
		System.out.println("-----업캐스팅-----");
		sTest.addShape(); //업캐스팅 된 상황에서 가져오는 것이다.
		System.out.println("-----다운캐스팅-----");
		sTest.testCasting();
	}
	
	//업캐스팅 메소드
	public void addShape() {
		//Shape c = new Circle();
		sList.add(new Circle());
		sList.add(new Rectangle());
		sList.add(new Triangle());
		
		for(Shape s : sList) {
			s.draw();
		}
	}
	
	//다운캐스팅 메소드
	
	public void testCasting() {
		
		for(int i=0;i<sList.size();i++) {
			Shape s=sList.get(i); //부모클래스로 받기
			
			if(s instanceof Circle) { 
				Circle c = (Circle)s;//다운캐스팅
				c.circle();
				c.draw();
			}else if (s instanceof Rectangle) {
				Rectangle r=(Rectangle)s;//다운캐스팅
				r.Rectangle();
				r.draw();
			}else if(s instanceof Triangle) {
				Triangle t=(Triangle)s;//다운캐스팅
				t.Triangle();
				t.draw();
			}else {
				System.out.println("지원되지 않는 타입입니다.");
			}
		}
		
	}

}

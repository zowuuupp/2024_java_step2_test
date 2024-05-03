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
		System.out.println("����� �Դϴ�.");
	}
}
class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}
	void Rectangle() {
		System.out.println("�簢�� ��� �Դϴ�.");
	}
}
class Triangle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Triangle");
	}
	void Triangle() {
		System.out.println("���� ��� �Դϴ�.");
	}
}

//===================================================
public class ShapeTest {
	
	ArrayList<Shape> sList=new ArrayList<Shape>();

	public static void main(String[] args) {
		
		ShapeTest sTest=new ShapeTest();
		System.out.println("-----��ĳ����-----");
		sTest.addShape(); //��ĳ���� �� ��Ȳ���� �������� ���̴�.
		System.out.println("-----�ٿ�ĳ����-----");
		sTest.testCasting();
	}
	
	//��ĳ���� �޼ҵ�
	public void addShape() {
		//Shape c = new Circle();
		sList.add(new Circle());
		sList.add(new Rectangle());
		sList.add(new Triangle());
		
		for(Shape s : sList) {
			s.draw();
		}
	}
	
	//�ٿ�ĳ���� �޼ҵ�
	
	public void testCasting() {
		
		for(int i=0;i<sList.size();i++) {
			Shape s=sList.get(i); //�θ�Ŭ������ �ޱ�
			
			if(s instanceof Circle) { 
				Circle c = (Circle)s;//�ٿ�ĳ����
				c.circle();
				c.draw();
			}else if (s instanceof Rectangle) {
				Rectangle r=(Rectangle)s;//�ٿ�ĳ����
				r.Rectangle();
				r.draw();
			}else if(s instanceof Triangle) {
				Triangle t=(Triangle)s;//�ٿ�ĳ����
				t.Triangle();
				t.draw();
			}else {
				System.out.println("�������� �ʴ� Ÿ���Դϴ�.");
			}
		}
		
	}

}

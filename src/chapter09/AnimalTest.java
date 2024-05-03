package chapter09;

//#1
class Animal {

	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

//========================================
//#2
class Human extends Animal {

	public void move() {	
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}

	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}

}

//#3
class Tiger extends Animal {

	public void move() {
		System.out.println("ȣ���̴� �׹߷� �Ƚ��ϴ�.");
	}

	public void hunting() {
		System.out.println("ȣ���̴� ����� �մϴ�.");
	}
}

//#4
class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}

	public void flying() {
		System.out.println("�������� ������ ��� ���� �ٴմϴ�.");
	}

}

// ------------------------------

public class AnimalTest {

	public void moveAnimal(Animal animal) { // Animal animal : Human, Tiger, Eagle�� �� ���� �Ǿ� �ִ�.
		animal.move();

	}

	public static void main(String[] args) {

		AnimalTest aTest = new AnimalTest();

		// new Human() : Human() h=new Human();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
		System.out.println();		
		Human h=new Human();
		h.readBook(); //�θ� �ڽĲ��� �� �� ����. �ڽĸ��� ������ �ִ� ���� ���� �̷��� ����� �Ѵ�.
		Tiger t=new Tiger();
		t.hunting();
		Eagle e=new Eagle();
		e.flying();
	}

}

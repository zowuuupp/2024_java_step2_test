package chapter16.arraylist;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
}
class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �Ƚ��ϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̴� ����� �մϴ�.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ������ ��� ���� �ٴմϴ�.");
	}
}
//===================================================================
public class AnimalMain {
	
	ArrayList<Animal> aList = new ArrayList<Animal>();

	public static void main(String[] args) {
		
		AnimalMain aTest = new AnimalMain();
		
		aTest.addAnimal();
		
		aTest.tectCasting();
		
		
	}
	//addAnimal -> ��ĳ���� �޼ҵ�
	public void addAnimal() {
		aList.add(new Human());
		aList.add(new Tiger());
		aList.add(new Eagle());
		for(Animal a : aList) {
			a.move();
		}
	}
	
	public void tectCasting() {
		for (int i=0; i<aList.size();i++) {
			Animal a = aList.get(i); // �θ� ArrayList�� ��ü�� ani��ü�� ����
		if (a instanceof Human) { //a�� customer , Human�� vip �� vip�� a�� �Ҽ��� �´���, �ڽ��� �´���. �´ٸ� ��� ������ �ٲ�. �̷� �����̴�.
			Human h = (Human)a;
			h.readBook();
			h.move();
		}else if(a instanceof Tiger) {
			Tiger t = (Tiger)a;
			t.hunting();
			t.move();
		}else if(a instanceof Eagle) {
			Eagle e = (Eagle)a;
			e.flying();
			e.move();
		}else {
			System.out.println("�ν� �� �� �����ϴ�.");
		}
		
		}
		
		
	}

}

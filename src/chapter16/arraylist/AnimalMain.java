package chapter16.arraylist;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}
class Human extends Animal{
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람은 책을 읽습니다.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다.");
	}
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리는 날개를 펴고 날아 다닙니다.");
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
	//addAnimal -> 업캐스팅 메소드
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
			Animal a = aList.get(i); // 부모 ArrayList의 객체를 ani객체에 저장
		if (a instanceof Human) { //a가 customer , Human이 vip 면 vip가 a의 소속이 맞느냐, 자식이 맞느냐. 맞다면 어떠한 혜택을 줄께. 이런 느낌이다.
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
			System.out.println("인식 할 수 없습니다.");
		}
		
		}
		
		
	}

}

package chapter11;

public class AnimalMain {

	public static void main(String[] args) {
		
		//���1
		System.out.println("-----���1-----");
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		Animal animal3= new Spider();
		
		System.out.println(animal1.kind);
		animal1.sound();
		System.out.println();

		System.out.println(animal2.kind);
		animal2.sound();
		System.out.println();
		
		System.out.println(animal3.kind);
		animal3.sound();
		System.out.println();
		
		//���2
		System.out.println("-----���2-----");
		animalSound(new Cat()); //Animal cat = new Cat();
		animalSound(new Dog()); //Animal dog = new Dog();
		animalSound(new Spider()); //Animal spider = new Spider();
		
		//���3
		System.out.println("-----���3-----");
		Animal animal=null;
		animal=new Cat();
		System.out.println(animal.kind);
		animal.sound();
		
		Animal animalD=null;
		animalD=new Dog();
		System.out.println(animalD.kind);
		animalD.sound();
		
		Animal animalS=null;
		animalS=new Spider();
		System.out.println(animalS.kind);
		animalS.sound();
		
		
	}
	// ���2
	static void animalSound(Animal animal) {
		animal.sound();
	}
	
	
	
	
}

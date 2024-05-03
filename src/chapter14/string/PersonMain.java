package chapter14.string;

public class PersonMain {

	public static void main(String[] args) throws ClassNotFoundException {
		//방법1
		Person person = new Person();
		System.out.println(person);
		
		Person person2 = new Person("SOLDESK");
		System.out.println(person2);
		
		Person person3 = new Person("SOLDESK",24);
		System.out.println(person3);
		
		Class pClass1=person.getClass(); // getClass는 void가 아니라 반환값을 받아야 한다.
		System.out.println(pClass1); //Class : 클래스 정보
		
		//방법2
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//방법3
		Class pClass3=Class.forName("chapter14.string.Person");
		System.out.println(pClass3.getName());
		
	}

}

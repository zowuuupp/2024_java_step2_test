package chapter20.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	//serialVersionID : 직렬화(2진화 : 얘네들의 언어인 byte로 바꿔주는 것) , 역직렬화(원래의 데이터로 바꿔주는 것)
	//A -> 65 -> 2진수(100001) | 100001 -> 65 -> A
	private static final long serialVersionID=1L;
	
	String name;
	String obj;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, String obj) {
		this.name=name;
		this.obj=obj;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", obj=" + obj + "]";
	}
	
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personHong = new Person("홍길동","대표이사");
		Person personKim = new Person("김길동","상무이사");
		
		//System.out.println(personHong);
		
		//-------------통신시 직렬화 작업----------------
		//ObjectOutputStream : 보조스트림이다. 파일이나 네트워크로 데이터를 전달하기 위한 직렬화 수행시 효율성 극대화
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			//직렬화
			oos.writeObject(personHong); //writeObject : 직렬화
			oos.writeObject(personKim);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//-------------통신시 직렬화 작업----------------
		//ObjectInputStream : 보조스트림이다. 파일이나 네트워크로 데이터를 다시 원래대로 돌려놓기 위한 작업. 역직렬화 수행시 효율성 극대화
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			//역직렬화
			Person p1 =(Person)ois.readObject(); // readObject() : 역직렬화 메소드
			Person p2 =(Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

package chapter20.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	//serialVersionID : ����ȭ(2��ȭ : ��׵��� ����� byte�� �ٲ��ִ� ��) , ������ȭ(������ �����ͷ� �ٲ��ִ� ��)
	//A -> 65 -> 2����(100001) | 100001 -> 65 -> A
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
		
		Person personHong = new Person("ȫ�浿","��ǥ�̻�");
		Person personKim = new Person("��浿","���̻�");
		
		//System.out.println(personHong);
		
		//-------------��Ž� ����ȭ �۾�----------------
		//ObjectOutputStream : ������Ʈ���̴�. �����̳� ��Ʈ��ũ�� �����͸� �����ϱ� ���� ����ȭ ����� ȿ���� �ش�ȭ
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			//����ȭ
			oos.writeObject(personHong); //writeObject : ����ȭ
			oos.writeObject(personKim);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//-------------��Ž� ����ȭ �۾�----------------
		//ObjectInputStream : ������Ʈ���̴�. �����̳� ��Ʈ��ũ�� �����͸� �ٽ� ������� �������� ���� �۾�. ������ȭ ����� ȿ���� �ش�ȭ
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			//������ȭ
			Person p1 =(Person)ois.readObject(); // readObject() : ������ȭ �޼ҵ�
			Person p2 =(Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

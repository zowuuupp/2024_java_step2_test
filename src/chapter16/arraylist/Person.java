package chapter16.arraylist;

public class Person {
	
	//�� ����� ���� ����
	private String name;
	private int age;
	private String tel;
	
	//������ �����ε�
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
	
	//getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	

}

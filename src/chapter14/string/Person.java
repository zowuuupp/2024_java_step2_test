package chapter14.string;

public class Person {

	public String name;
	public int age;

	// �����ڸ� �����ε�(1.name �ʱ�ȭ | 2.name, �̸� �ʱ�ȭ)�� �ϵ� ����Ʈ �����ڵ� ����� �� �ֵ���.
	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter & setter
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

	// toString �������̵�

	@Override
	public String toString() {
		return name + ", "+age;
	}

}

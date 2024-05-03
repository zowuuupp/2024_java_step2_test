package chapter09;

public class DmbCellPhone extends CellPhone {

	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		// super(); // extends CellPhone �� ������ java lang ��Ű���� Object�� Ŭ������ �޴´�.
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	};

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}

	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	};

}

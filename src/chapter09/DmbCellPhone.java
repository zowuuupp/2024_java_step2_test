package chapter09;

public class DmbCellPhone extends CellPhone {

	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		// super(); // extends CellPhone 이 없으면 java lang 패키지의 Object의 클래스를 받는다.
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	};

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	};

}

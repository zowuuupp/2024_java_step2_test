package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("Java폰", "화이트", 11);

		// CellPhone으로부터 상속받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);

		// DmbCellPhone
		System.out.println("채널: " + dmbCellPhone.channel);
		System.out.println("---------------------------------");
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕!! 점심은 뭐먹을까?");
		dmbCellPhone.sendVoice("아무꺼나");
		dmbCellPhone.powerOff();
		System.out.println();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(5);
		dmbCellPhone.turnOffDmb();

	}

}

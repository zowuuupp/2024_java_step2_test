package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("Java��", "ȭ��Ʈ", 11);

		// CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);

		// DmbCellPhone
		System.out.println("ä��: " + dmbCellPhone.channel);
		System.out.println("---------------------------------");
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ�!! ������ ��������?");
		dmbCellPhone.sendVoice("�ƹ�����");
		dmbCellPhone.powerOff();
		System.out.println();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(5);
		dmbCellPhone.turnOffDmb();

	}

}

package chapter12.Interface;

//���߻���� �� ������ �������̽��� �����ϴ�.
public class SmartTelevision implements Remote, Searchable {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		// ���࿡ MAX_VOLUME���� volume�� ũ�� MAX_VOLUME ���� volume�� ����
		// �� ���࿡ MIN_VOLUME���� volume�� ������ MIN_VOLUME���� volume�� ����
		// �� �ۿ� volume�� this.volume�� ����
		// ����� : ���� TV ���� : 8
		if (volume > Remote.MAX_VOLUME) { //static ������ �ִ� �� ���� ���� ���ؼ��� ���� static ������ �ƴ� �̻� �տ� Ŭ�������� ������ ����� �Ѵ�.
			this.volume = Remote.MAX_VOLUME;
		} 
		else if (volume < Remote.MIN_VOLUME) {
			this.volume = Remote.MIN_VOLUME;
		} 
		else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

}

package chapter12.Interface;

//다중상속은 안 되지만 인터페이스는 가능하다.
public class SmartTelevision implements Remote, Searchable {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// 만약에 MAX_VOLUME보다 volume이 크면 MAX_VOLUME 값을 volume에 대입
		// 또 만약에 MIN_VOLUME보다 volume이 작으면 MIN_VOLUME값을 volume에 대입
		// 그 밖에 volume을 this.volume에 대입
		// 출력은 : 현재 TV 볼륨 : 8
		if (volume > Remote.MAX_VOLUME) { //static 영역에 있는 걸 끌고 오기 위해서는 같은 static 영역이 아닌 이상 앞에 클래스명을 가지고 와줘야 한다.
			this.volume = Remote.MAX_VOLUME;
		} 
		else if (volume < Remote.MIN_VOLUME) {
			this.volume = Remote.MIN_VOLUME;
		} 
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

}

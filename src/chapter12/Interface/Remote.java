package chapter12.Interface;

public interface Remote {
	
	//��� , //public static final
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	//�߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	
	

}

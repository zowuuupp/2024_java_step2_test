package chapter11;

public class MainBoard {

	public static void main(String[] args) {
		
		
		//���� 1�ܰ�
		Player player = new Player();
		player.play(1);
	
		//���� 2�ܰ�
		player.upgradeLevel(new AdvencedLevel()); //PlayerLevel alevel = new AdvencedLevel();
		player.play(3);
		
		//���� 3�ܰ�
		player.upgradeLevel(new SuperLevel());
		player.play(5);
		
		
		/*
		//���� ������ ����.
		//���� 1�ܰ�
		PlayerLevel bpl = new BeginnerLevel();
		bpl.showLevelMessage();
		bpl.go(2);
		
		PlayerLevel apl = new AdvencedLevel();
		apl.showLevelMessage();
		apl.go(5);
		
		PlayerLevel spl = new SuperLevel();
		spl.showLevelMessage();
		spl.go(7);
		*/
		
	}
	//���� ������ �� ��.
	/*
	public void play(PlayerLevel pl , int count) {
		pl.go(count);
	}
	*/

}

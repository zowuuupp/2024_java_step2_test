package chapter11;

public class MainBoard {

	public static void main(String[] args) {
		
		
		//게임 1단계
		Player player = new Player();
		player.play(1);
	
		//게임 2단계
		player.upgradeLevel(new AdvencedLevel()); //PlayerLevel alevel = new AdvencedLevel();
		player.play(3);
		
		//게임 3단계
		player.upgradeLevel(new SuperLevel());
		player.play(5);
		
		
		/*
		//내가 연습해 본것.
		//게임 1단계
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
	//내가 연습해 본 것.
	/*
	public void play(PlayerLevel pl , int count) {
		pl.go(count);
	}
	*/

}

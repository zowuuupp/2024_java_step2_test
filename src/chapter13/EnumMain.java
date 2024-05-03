package chapter13;

import java.util.Scanner;

public class EnumMain {
	
	public enum Item{Start,Pause,Exit} // 0 1 2

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하세요[0:게임시작, 1:일시정지, 2:게임종료] : ");
			int n =scan.nextInt();
			
			Item start=Item.Start; // start = 0 을 기억하는 것.
			Item pause=Item.Pause; // start = 1 을 기억하는 것.
			Item exit=Item.Exit; // start = 2 을 기억하는 것.
			
			if(n==start.ordinal()) { //.ordinal() : enum 타입의 데이터를 index값으로 변경
				System.out.println("게임이 시작됩니다.");
			}else if (n==pause.ordinal()) {
				System.out.println("게임이 정지됩니다.");
			}else if (n==exit.ordinal()) {
				System.out.println("게임이 종료됩니다.");
				return;//break도 가능
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		
		}
	}

}

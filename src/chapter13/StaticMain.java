package chapter13;

import javax.swing.JOptionPane;

class Out2{
	//멤버 변수
	static int a=1; //정적변수(정적메소드)로 클래스내에 하나만 존재하며 모든 객체가 공유할 수 있음
	int b; //객체마다 서로 다른 값을 가질 수 있음
	
	public static class In{
		String Infun() {
			return (a+"번째 static 내부 클래스");
		}
	}
}

public class StaticMain {

	public static void main(String[] args) {
		//static은 클래스명으로 직접 접근이 가능
		Out2.In obj2 = new Out2.In();
		//내부에 있는 메소드
		String str = obj2.Infun();
		JOptionPane.showMessageDialog(null, str+"\n Success");
		
		
		
		
		
		
		
		
	}

}

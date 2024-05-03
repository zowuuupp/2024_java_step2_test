package chapter08;

import javax.swing.JOptionPane;

public class FinalTest {
	//멤버변수(힙에서 기억) -> static을 적는 순간 전역변수가 된다.
	private static final int MAX=3;//static을 적으면 이러면 데이타, static이니 중요한 것일것이다? private를 적자.

	public static void main(String[] args) {
		//지역변수(메인 지역에서만 사용이 가능하다) (스택 : 여기서만 쓰이고 다른데 벗어나면 소멸한다.)
		int num=0;//선언
		num=1;//재정의
		
		for(int i=0; i<MAX;i++) { //힙과 스택이라 다르다. 어떻게 해야 할까? 데이타다. 그런 걸 전역변수 라고 한다. static을 위에서 추가하면 된다.
			num=Integer.parseInt(JOptionPane.showInputDialog("값 입력"));
			if (num >MAX) {
				System.out.println("입력하신 숫자는 3보다 큽니다.");
			}
			else {
				System.out.println("입력하신 숫자는 3보다 작거나 같습니다.");
			}	
		}
		
		
		
	}

}

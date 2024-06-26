package chapter16.frame;

import java.awt.Color;

public class FrameTest05 {

	public static void main(String[] args) {

		MyFrame04 fr=new MyFrame04();
		fr.setBackground(Color.YELLOW);
		fr.setTitle("다섯번째 사용자 프레임");
		
		//#1
		//WindowListener를 구현하고 있는 MyEventListener참조
		//fr.addWindowListener(new MyEventListener());
		//#2
		fr.addWindowListener(new WinClosingListener());
		
		//#3
		/*
		fr.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("어댑터를 생성하여 close감지!");
				System.exit(0);
			}
			
		});
		*/
	}

}

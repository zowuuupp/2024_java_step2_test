package chapter16.frame;

import java.awt.Color;

public class FrameTest05 {

	public static void main(String[] args) {

		MyFrame04 fr=new MyFrame04();
		fr.setBackground(Color.YELLOW);
		fr.setTitle("�ټ���° ����� ������");
		
		//#1
		//WindowListener�� �����ϰ� �ִ� MyEventListener����
		//fr.addWindowListener(new MyEventListener());
		//#2
		fr.addWindowListener(new WinClosingListener());
		
		//#3
		/*
		fr.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("����͸� �����Ͽ� close����!");
				System.exit(0);
			}
			
		});
		*/
	}

}

package chapter16.frame;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest04 {

	public static void main(String[] args) {

        MyFrame04 fr=new MyFrame04();
        fr.setBackground(Color.yellow);
        fr.setTitle("네번째 사용자 프레임");
          
        //종료
  		fr.addWindowListener(new WindowAdapter() {
  		@Override
  		public void windowClosing(WindowEvent e) {
  			// TODO Auto-generated method stub
  			System.exit(0);
  			}
  		});

	}

}

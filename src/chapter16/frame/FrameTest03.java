package chapter16.frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest03 {

	public static void main(String[] args) {
		/*
		 화면의 중앙에 프레임 위치 시키기
		 1. 실행 중인 모니터의 해상도를 알아내기
		 2. 모니터의 중앙 좌표를 알아놓기
		 3. 프레임 좌우 크기를 모니터의 중앙 좌표에서 빼줘야함
		 
		 x : 모니터 중앙 x좌표값 - 내가 만들려는 프레인 width/2
		 y : 모니터 중앙 y좌표값 - 내가 만들려는 프레인 height/2
		 */
		Frame fr=new Frame("세번째");
		fr.setSize(400, 400);
		
		//1.Toolkit을 통해 모니터의 해상도를 얻어오기
		Toolkit tk=Toolkit.getDefaultToolkit(); //객체가 아니라 클래스에서 바로 가져왔다. static에서 가져온거다.
		/*
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(1000); //1초 동안 잠시 대기하고 멈출께요.
			} catch (Exception e) {
				e.printStackTrace();
			}
			tk.beep();
		}//for
		*/
		
		//2.Dimemsion을 통해서 중앙 좌표값 설정하기
		Dimension di=tk.getScreenSize();
		int monitorW=di.width;
		int monitorH=di.height;
		
		//3.프레임 좌우 크기 빼주기
		int x=monitorW/2-fr.getWidth()/2;
		int y=monitorH/2-fr.getHeight()/2;
		
		//종료
		fr.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
			}
		});
		
		fr.setLocation(x,y);
		fr.setVisible(true);
		

	}

}

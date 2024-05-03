package chapter16.frame;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutTest01 {

	public static void main(String[] args) {
		// 왼쪽 -> 오른쪽 자동 배치
		// 공간이 없으면 아래로 자동 배치
		
		//Frame 설정
		Frame f=new Frame();
		f.setBounds(800,100,1000,500);
		f.setLayout(new FlowLayout());
		
		//-----------------------------------
		
		//버튼 구현
		Button btn1=new Button("1");
		Button btn2=new Button("2");
		Button btn3=new Button("3");
		Button btn4=new Button("4");
		
		//FlowLayout 사이즈 조정이 불가능 => setSize(500,200); 로 변경이 자유롭지 못함
		btn1.setPreferredSize(new Dimension(200,100));
		btn2.setPreferredSize(new Dimension(200,100));
		btn3.setPreferredSize(new Dimension(200,100));
		btn4.setPreferredSize(new Dimension(200,100));
		//-----------------------------------------------
		
		//Frame에 Button 붙이기
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		
		f.setVisible(true);
		
		//액션 호출
		btn1.addActionListener(al);
		btn2.addActionListener(al);
		btn3.addActionListener(al);
		btn4.addActionListener(al);
		
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
		});
	}//main
	
	static ActionListener al = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			//버튼별 이벤트
			if(e.getActionCommand().equals("1")) {
				System.out.println("1번 눌렸음");
			}else if(e.getActionCommand().equals("2")) {
				System.out.println("2번 눌렸음");
			}else if(e.getActionCommand().equals("3")) {
				System.out.println("3번 눌렸음");
			}else if(e.getActionCommand().equals("4")) {
				System.out.println("4번 눌렸음");
			}
			System.out.println("------------------------------");
		}
		
	};
	

}

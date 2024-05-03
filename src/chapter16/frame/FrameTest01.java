package chapter16.frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest01 {

	public static void main(String[] args) {
		
		/*
		Frame frame=new Frame("첫 프레임"); //프레임 제목
		
		frame.setBounds(800,100,400,300); //(x좌표, y좌표, 너비 ,높이)  // (x,y) 지점에서 너비와 높이만큼 창을 만든다. x는 맨왼쪽 y는 위에서 부터 아래로 측정.
		
		frame.setBackground(Color.BLUE);
		
		frame.setVisible(true);
		
		//끌려면 console에 가서 빨간 정지 버튼 누르면 된다.
		
		Frame frame1=new Frame("제목");
		
		Button[] arbtn=new Button[5];//0 1 2 3 4
		*/
		
		Frame frame=new Frame("제목");
		
		Button[] arbtn=new Button[5];//0 1 2 3 4
		
		String[] btnTiles = {"닫기","열기","취소","확인","안녕"};
		
		for(int i=0;i<arbtn.length;i++) {
			arbtn[i]=new Button(btnTiles[i]);
		}
		frame.add(arbtn[0], BorderLayout.EAST); //첫번째 버튼을 동쪽에 놓겠다.
		frame.add(arbtn[1], BorderLayout.WEST); 
		frame.add(arbtn[2], BorderLayout.SOUTH); 
		frame.add(arbtn[3], BorderLayout.NORTH); 
		frame.add(arbtn[4], BorderLayout.CENTER); 
		
		frame.pack();//화면에 출력
		frame.setVisible(true);//위에 꺼 무한반복 , 창 닫기를 할떄까지 계속 떠있는다.
		
		//0번 버튼을 누르면
		arbtn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // 끝을 내라.
			}
		});
		
		//열린 창 x버튼 누를때
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); //프로그램 종료
			}
			
		});
		
	}

}

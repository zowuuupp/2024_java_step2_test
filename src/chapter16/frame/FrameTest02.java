package chapter16.frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FrameTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		JFrame fr=new JFrame("두번째");
		fr.setSize(400, 400); //사이즈
		fr.setLocation(800, 100);//좌표
		
		//X버튼을 눌렀을때 닫기 
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//현재 창의 메모리 소멸
		fr.setVisible(true);
		
		//여러개의 프레임중 원하는 하나의 프레임만 종료할때 사용(JFrame) -> dispose()
		//fr.dispose();
		*/
		
		//프레임 설정
		Frame frame=new Frame("문장 입력기"); 
		frame.setBounds(800, 100, 250, 400);
		frame.setBackground(Color.CYAN);
		
		//폰트(글꼴, 굵기, 크기)
		Font font=new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		
		//북쪽단
		//컴포넌트를 하나로 묶는다 panel
		Panel pNorth=new Panel();
		pNorth.setBackground(Color.GREEN);
		
		frame.setVisible(true);
		frame.setResizable(false); //화면 크기 잠그기
		
		//입력상자 만들기
		TextField tf=new TextField(10);
		Button btn=new Button("입력");
		btn.setEnabled(false); //"입력" 버튼 비활성화
		
		//panel에 입력상자 넣기
		pNorth.add(tf);
		pNorth.add(btn);
		pNorth.setFont(font);
		
		//중앙단
		TextArea ta=new TextArea("", 0, 0, TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEnabled(false);
		
		//남쪽단
		Panel pSouth = new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(Color.MAGENTA);
		
		frame.setVisible(true);
		
		Button btnSave=new Button("저장");
		Button btnClose=new Button("닫기");
		
		pSouth.add(btnSave);
		pSouth.add(btnClose);
		
		
		
		
		//컴포넌트 배치
		//Panel에 배치하는 코드 BorderLayout
		frame.add(pNorth, BorderLayout.NORTH);
		frame.add(ta, BorderLayout.CENTER);
		frame.add(pSouth, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.setResizable(false);
		
		//-----------------------------------------
		//TextField에 값이 들어간 경우에만 입력버튼 활성화
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().equals("")) { //입력칸에 아무것도 없으면
					btn.setEnabled(false);//닫는다
				}else {
					btn.setEnabled(true);//연다
				}
			}
		});
		
		//--------------------Key이벤트----------------------
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()== KeyEvent.VK_ENTER) {
					ta.append(tf.getText()+"\n");
					
					//텍스프필드 비우기
					tf.setText("");
					//포커스 이동
					tf.requestFocus();
				}
			}
			
		});
		
		//-----------------Button이벤트---------------------
		btn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {//버튼을 가지고 뭘 하면
				ta.append(tf.getText()+"\n");//append :추가할 것이다. 그리고 "\n"으로 내릴것이다.
				
				//텍스트필드 비워주고 포커스 이동
				tf.setText("");
				tf.requestFocus();
				
			}
		});
		
		//------------------Button이벤트(닫기)--------------------
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//------------------Button이벤트(저장)--------------------
	      btnSave.addActionListener(new ActionListener() {   
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            String message=ta.getText();
	            
	            try {
	               //FileDialog(save, load할때 사용되는 공통모듈(대화상자))
	               FileDialog fd=new FileDialog(frame, "저장",FileDialog.SAVE );
	               fd.setVisible(true);
	               //System.out.println(fd.getDirectory()+fd.getFile());
	               String path=fd.getDirectory()+fd.getFile();
	               if(!message.equals("")) { //message에 데이터가 비워있지 않다면
	                  FileWriter fw=new FileWriter(path);
	                  BufferedWriter bw=new BufferedWriter(fw); //보조입력기
	                  
	                  bw.write(message);
	                  
	                  //FileDialog에 취소버튼을 누르지 않고 정상 저장 
	                  //저장한 경우
	                  if(fd.getFile() != null) {
	                     JOptionPane.showMessageDialog(frame, path+"\n 경로에 저장했습니다.");
	                  }
	                  bw.close();
	               }else { //TextArea에 기록할게 없다면
	                  JOptionPane.showMessageDialog(frame, "저장 할 내용이 없습니다.");
	               }
	               
	            } catch (IOException e1) {
	               e1.printStackTrace();
	            }
	         }
	      });
		
		//종료
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
			
		
		
	}

}

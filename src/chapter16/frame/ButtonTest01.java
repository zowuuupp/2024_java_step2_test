package chapter16.frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest01 {

	public static void main(String[] args) {
		
		Frame f=new Frame("버튼 테스트");
		
		f.setBounds(200,200,400,400);
		
		f.setLayout(null);//자동배치 사용 안함
		
		//Frame에 추가되는 각각의 컨포넌트를 고유 사이즈와 위치를 설정
		Button btnOK = new Button("확인");
		btnOK.setBounds(70,90, 100, 50);
		btnOK.setBackground(new Color(255,153,153));
		
		Button btnClose = new Button("닫기");
		btnClose.setBounds(btnOK.getBounds());//btnOK와 같은 사이즈 사용
		
		btnClose.setLocation(btnOK.getX()+btnOK.getWidth()+60, btnOK.getY());
		btnClose.setBackground(new Color(255,205,197));
		
		f.add(btnOK);
		f.add(btnClose);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}

}

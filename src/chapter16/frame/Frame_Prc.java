package chapter16.frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame_Prc {

	public static void main(String[] args) {
		
		Frame fr = new Frame("�׽�Ʈ");
		
		fr.setBounds(800,100,250,400);
		fr.setBackground(Color.blue);
		
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		
		Panel np= new Panel();
		np.setBackground(Color.GREEN);
		
		fr.setVisible(true);
		fr.setResizable(false);
		
		TextField tf = new TextField(10);
		Button btn = new Button("�Է�");
		btn.setEnabled(false);
		
		fr.add(tf);
		fr.add(btn);
		fr.setFont(font);
		
		
		Panel sp= new Panel();
		sp.setBackground(Color.red);
		sp.setFont(font);
		
		fr.setVisible(true);
		
		Button btnSave=new Button("����");
		Button btnClose=new Button("�ݱ�");
		
		Panel cp= new Panel();
		cp.setBackground(Color.GRAY);
		cp.setFont(font);
		
		fr.add(np, BorderLayout.NORTH);
		fr.add(cp, BorderLayout.CENTER);
		fr.add(sp, BorderLayout.SOUTH);
		
		TextField tf2 = new TextField(10);
		Button btn2 = new Button("�Է�");
		btn.setEnabled(false);
		
		fr.add(tf2);
		fr.add(btn2);
		fr.setFont(font);
			
				
		//���� â x��ư ������
		fr.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); //���α׷� ����
			}
					
		});
		
		
		
		

	}

}

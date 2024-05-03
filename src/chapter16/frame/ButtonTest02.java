package chapter16.frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonTest02 extends JFrame{
	
	JPanel main_panel;
	
	JButton bt_img;
	
	ImageIcon img1=new ImageIcon("btn1.jpg");
	ImageIcon img2=new ImageIcon("btn1_1.jpg");
	
	public ButtonTest02() {
		setTitle("JButton �̹��� �ֱ�");//������ Ÿ��Ʋ�� �ؽ�Ʈ ����
		setSize(500,200);//������ ũ��(�ȼ�)
		//X��ư ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main_panel=new JPanel(); //�г� ����Ȯ��. ��, ��ü�� ����
		main_panel.setBackground(Color.WHITE); //����
		bt_img=new JButton(img1);
		bt_img.setRolloverIcon(img2);//��ư�� ���콺�� �ö� �� �̹��� ��ȯ
		bt_img.setBorderPainted(false);//��ư �׵θ� ��������
		bt_img.setPreferredSize(new Dimension(150,50)); //��ư ũ�� ����
		
		main_panel.add(bt_img);
		add(main_panel);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
	}
	
	
	

	public static void main(String[] args) {
		new ButtonTest02();

	}
	

}

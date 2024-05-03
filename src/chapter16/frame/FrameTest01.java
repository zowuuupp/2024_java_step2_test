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
		Frame frame=new Frame("ù ������"); //������ ����
		
		frame.setBounds(800,100,400,300); //(x��ǥ, y��ǥ, �ʺ� ,����)  // (x,y) �������� �ʺ�� ���̸�ŭ â�� �����. x�� �ǿ��� y�� ������ ���� �Ʒ��� ����.
		
		frame.setBackground(Color.BLUE);
		
		frame.setVisible(true);
		
		//������ console�� ���� ���� ���� ��ư ������ �ȴ�.
		
		Frame frame1=new Frame("����");
		
		Button[] arbtn=new Button[5];//0 1 2 3 4
		*/
		
		Frame frame=new Frame("����");
		
		Button[] arbtn=new Button[5];//0 1 2 3 4
		
		String[] btnTiles = {"�ݱ�","����","���","Ȯ��","�ȳ�"};
		
		for(int i=0;i<arbtn.length;i++) {
			arbtn[i]=new Button(btnTiles[i]);
		}
		frame.add(arbtn[0], BorderLayout.EAST); //ù��° ��ư�� ���ʿ� ���ڴ�.
		frame.add(arbtn[1], BorderLayout.WEST); 
		frame.add(arbtn[2], BorderLayout.SOUTH); 
		frame.add(arbtn[3], BorderLayout.NORTH); 
		frame.add(arbtn[4], BorderLayout.CENTER); 
		
		frame.pack();//ȭ�鿡 ���
		frame.setVisible(true);//���� �� ���ѹݺ� , â �ݱ⸦ �ҋ����� ��� ���ִ´�.
		
		//0�� ��ư�� ������
		arbtn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // ���� ����.
			}
		});
		
		//���� â x��ư ������
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); //���α׷� ����
			}
			
		});
		
	}

}

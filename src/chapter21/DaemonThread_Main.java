package chapter21;

public class DaemonThread_Main implements Runnable{
	
	static boolean autoSave=false; //�ڵ������� ������� �ʱ�ȭ

	public static void main(String[] args) {
		//���󽺷���
		/*
		 �ٸ� �Ϲ� �������� �۾��� ���� �������� ������ ����
		 ��, �Բ� �������� �Ϲ� �����尡 ����Ǹ� ���󽺷��嵵 ����ȴ�.
		 */
		
		DaemonThread_Main dm = new DaemonThread_Main();
		Thread t=new Thread(dm); //run()�� start()�� ����. ��, ������ȭ ��Ŵ
		t.setDaemon(true); //���󽺷���� �����ϸ鼭 �Ϲ� �����尡 ����Ǹ� ���󽺷��嵵 ����(������ ������ �ʵ� ���� ������)
		t.start(); //run()
		
		for(int i=0;i<=15;i++) {
			//���ν�����
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
			
			if(i==3) //3�� �ڿ� �ڵ�������� ��ȯ
				autoSave=true;
		}
		
	}//main
	//----------------------------------------------------------------
	
	//3�ʿ� �ѹ� �����ϱ�
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000); //3��
			} catch (Exception e) {
				e.printStackTrace();
			}//try
			
			if(autoSave == true) {
				System.out.println("�ڵ����� �˴ϴ�.");
			}
		}
	}

}//class

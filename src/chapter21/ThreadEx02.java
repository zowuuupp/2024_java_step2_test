package chapter21;

public class ThreadEx02 extends Thread{
	
	
	private int[] temp;
	
	public ThreadEx02() { // 0 1 2 ... 9
		temp=new int[10];
		for(int i=0;i<temp.length;i++) {
			temp[i]=i;
		}
	}//������

	@Override
	public void run() {
		
		for(int i:temp) {
			try {//�ܺο��� ������ try
				Thread.sleep(1000); //1000�� 1��
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("temp : "+temp[i]);
		}
		
		
	}
	
	

}

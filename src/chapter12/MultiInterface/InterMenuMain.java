package chapter12.MultiInterface;

public class InterMenuMain implements Inter_Menu3{

	public static void main(String[] args) {
		InterMenuMain im = new InterMenuMain();
		
		//�θ�=�ڽ�
		Inter_Menu1 im1=new InterMenuMain(); //��ĳ����
		Inter_Menu2 im2=new InterMenuMain();
		Inter_Menu3 im3=new InterMenuMain();
		
		System.out.println("---Inter_Menu1----");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambong());
		im1.show();
		System.out.println("---Inter_Menu2----");
		System.out.println(im2.tangsuyuck());
		im2.tangsuyuck();
		System.out.println("---Inter_Menu3----");
		System.out.println(im3.jajang());
		System.out.println(im3.jjambong());
		System.out.println(im3.tangsuyuck());
		System.out.println(im3.boggembab());
		im3.show();
		
		
		
	}

	@Override
	public String jajang() {
		return "¥�� �ܸ�";
	}

	@Override
	public String jjambong() {
		return "«�� �Ҹ�";
	}

	@Override
	public String tangsuyuck() {
		return "���� ������ ��";
	}

	@Override
	public String boggembab() {
		return "�ع� ������ ���̽�";
	}

}

package chapter12.MultiInterface;

public class InterMenuMain implements Inter_Menu3{

	public static void main(String[] args) {
		InterMenuMain im = new InterMenuMain();
		
		//ºÎ¸ğ=ÀÚ½Ä
		Inter_Menu1 im1=new InterMenuMain(); //¾÷Ä³½ºÆÃ
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
		return "Â¥Àå ²Ü¸À";
	}

	@Override
	public String jjambong() {
		return "Â«»Í ºÒ¸À";
	}

	@Override
	public String tangsuyuck() {
		return "Âı½Ò ÅÁ¼öÀ° ±Â";
	}

	@Override
	public String boggembab() {
		return "ÇØ¹° ººÀ½¹ä ³ªÀÌ½º";
	}

}

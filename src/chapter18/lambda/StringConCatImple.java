package chapter18.lambda;

public class StringConCatImple implements StringConCat{
	
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1+" "+s2);
	}
}

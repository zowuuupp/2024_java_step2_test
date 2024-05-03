package chapter16.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("Jave");
		list.add("Oracle");
		list.add("JSP");
		list.add("Python");
		list.add(2,"Spring");//ÀÚ¸®¸¦ ¹Ð¾î³¿
		
		int size=list.size();
		System.out.println("ÃÑ °´Ã¼¼ö : "+size);
		System.out.println();
		
		String skill=list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
			System.out.println((i+1)+" : "+str);
		}
		
		
		
		
		
		
	}

}

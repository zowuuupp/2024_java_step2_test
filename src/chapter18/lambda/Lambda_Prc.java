package chapter18.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda_Prc {
	
	public static void main(String[] args) {
		
		List<String> sList=new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		sList.stream().sorted().forEach(s->System.out.print(s+" "));
		System.out.println();
		
	}

}

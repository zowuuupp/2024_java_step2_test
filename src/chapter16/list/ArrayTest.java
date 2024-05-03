package chapter16.list;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		
		int iArray[]= {50,40,30,20,10};
		String sArray[]=new String[5];
		
		//Arrays 클래스는 항목 정렬, 항목 검색, 항목 비교에 관한 메소드 제공
		
		System.out.println(Arrays.toString(iArray));
		Arrays.sort(iArray);
		System.out.println(Arrays.toString(iArray));
		
		Arrays.fill(sArray, "Good!");//이런 말로 5개를 채우겠습니다.
		System.out.println(Arrays.toString(sArray));
		
		List<String> City= Arrays.asList("Seoul", "Inchon", "Busan", "Jeju", "Deaeon"); // List 계열은 length가 정해진게 없다. 더 적고 싶으면 더 적어도 된다.
		for (int i=0;i<City.size();i++) {//여기는 size 이다.
			System.out.println(City.get(i).toString());
		}
		
		
		
	}

}

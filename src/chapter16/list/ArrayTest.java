package chapter16.list;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		
		int iArray[]= {50,40,30,20,10};
		String sArray[]=new String[5];
		
		//Arrays Ŭ������ �׸� ����, �׸� �˻�, �׸� �񱳿� ���� �޼ҵ� ����
		
		System.out.println(Arrays.toString(iArray));
		Arrays.sort(iArray);
		System.out.println(Arrays.toString(iArray));
		
		Arrays.fill(sArray, "Good!");//�̷� ���� 5���� ä��ڽ��ϴ�.
		System.out.println(Arrays.toString(sArray));
		
		List<String> City= Arrays.asList("Seoul", "Inchon", "Busan", "Jeju", "Deaeon"); // List �迭�� length�� �������� ����. �� ���� ������ �� ��� �ȴ�.
		for (int i=0;i<City.size();i++) {//����� size �̴�.
			System.out.println(City.get(i).toString());
		}
		
		
		
	}

}

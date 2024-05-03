package chapter18.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStreamTest {

	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5};
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//���ٽ�
		System.out.println();
		Arrays.stream(arr).forEach(n->System.out.print(n+" "));
		System.out.println();
		System.out.println(Arrays.stream(arr).sum());
		System.out.println();
		
		//-------------------------------------------
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int total = list.stream().mapToInt(n->n.intValue()).sum();
		System.out.println(total);
	}

}

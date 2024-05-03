package chapter18.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		//int => IntStream 형변환
		IntStream stream = Arrays.stream(arr);
		int sum=stream.sum();
		System.out.println(sum);
		
		//sum()은 Integer로 반환되므로 unBoxing하여 사용
		int sumVal = Arrays.stream(arr).sum(); //얘는 Integer라 걍 넘어가는 것, 밑에와 비교.
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sumVal);
		System.out.println(count);
		
		/*
		//ERROR 한번 사용하였으므로 재선언이 안 된다. 이미 소멸된 stream으로 간주함.
		count(int)stream.count();
		System.out.println(count);
		*/
		
		//재선언 가능
		int count2=(int)Arrays.stream(arr).count();
		System.out.println(count2);
		
		//reduce(초깃값, 전달되는 요소 -> 각 요소가 수행하는 기능)
		System.out.println(Arrays.stream(arr).reduce(0,(a,b)->a+b )); // 0번째 부터 시작해서 1+2 , 3+3 , 6+4 , 10+5
		
		
		
	}

}

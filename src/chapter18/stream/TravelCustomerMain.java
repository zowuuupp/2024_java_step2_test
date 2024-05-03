package chapter18.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TravelCustomerMain {

	public static void main(String[] args) {
		
		//가방
		List<TravelCustomer> customerList = new ArrayList<>();
		
		//객체 생성
		TravelCustomer cumtomerLee = new TravelCustomer("이순신",53,28000);
		TravelCustomer cumtomerKim = new TravelCustomer("김유신",25,35000);
		TravelCustomer cumtomerHong = new TravelCustomer("홍길동",34,40000);
		
		//추가
		customerList.add(cumtomerHong);
		customerList.add(cumtomerKim);
		customerList.add(cumtomerLee);
		
		System.out.println("==고객 명단 추가된 순서대로 출력==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.print(s+" "));
		//mapToInt : Integer -> int
		System.out.println();
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 수입 : "+total);
				
		//filter : 특정 조건에 맞는 데이터만 걸러낸다
        System.out.println("==30세 이상의 고객의 이름을 정렬하여 출력==");
        customerList.stream().filter(c->c.getAge()>=30).
        					  							map(c->c.getName()).sorted().
        					  							forEach(s->System.out.println(s));
		
		
	}

}

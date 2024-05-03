package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("관광객 수 : ");
		int n= scan.nextInt();
		
		//초기화를 통해서 메모리 확보 및 고객생성(Guide의 객체)
		Guide guide = new Guide(n);
		
		//관광객 등록
		System.out.println("관광객 등록");
		for(int i=0;i<n;i++) {
			String name=scan.next();
			System.out.println((i+1)+". 이름: ");
			guide.guest[i].setName(name);
			String gender=scan.next();
			System.out.println((i+1)+". 성별: ");
			guide.guest[i].setGender(gender);
			
outer:	while(true) {
				System.out.println("1. 관광객 정보");
				System.out.println("2. 목적지 변경");
				System.out.println("3. 종료");
				System.out.println("선택>>");
				
				int select=scan.nextInt();
				
				switch (select) {
				case 1 : 
					for (i=0;i<n;i++) {
						System.out.println((i+1)+". 이름: "+guide.guest[i].getName());
						System.out.println((i+1)+". 성별: "+guide.guest[i].getGender());
						System.out.println((i+1)+". 여행지: "+guide.getPoint());
					}
					break;
				case 2 :
					System.out.print("어디로 변경하시겠습니까?: ");
					Guide.point=scan.next();
					System.out.println(Guide.point+"로 목적지가 변경됨");
					System.out.println("==========================");
					break;
				case 3 : 
					System.out.println("종료");
					break outer;
				default:
					
					break;
				}//switch
				
				
			}//while
			
		}
		
		
	}

}

/*
스테틱 변수 point를 가지는 Guide클래스를 만들고, 
이름과 성별 정보를 갖는 Guest 클래스를 만들어 아래의 결과가 나오도록 하는 로직을 구현
최초 실행시 등록할 관광객 수를 지정.
지정한 수 만큼 Guest클래스의 배열로 만듬ddddddddddddddddddddddddddddddddddddddddddddddddddddddqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqd

결과 : 

	관광객 수 : 2 (사용자가 입력)
	관광객 등록
	1. 이름 : 홍길동
	1. 성별 : 남
	--------------------------
	2. 이름 : 홍길순
	2. 성별 : 여
	
	1. 관광객 정보
	2. 목적지 변경
	3. 종료
	
	선택 >> 1
	1. 이름 : 홍길동
	1. 성별 : 남
	1. 목적지 : 가거도
	--------------------------------------
	2. 이름 : 홍길순
	2. 성별 : 여
	2. 목적지 : 가거도
	========================================
	1. 관광객 정보
	2. 목적지 변경
	3. 종료
	
	선택 >> 2	
	어디
	선택 >> 2	
	어디로 변경하시겠습니까 : 오이도
	오이도로 목적지 변경
========================================
	1. 관광객 정보
	2. 목적지 변경
	3. 종료
	선택 >> 3
	종료
*/












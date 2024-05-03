package chapter18.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TravelCustomerMain {

	public static void main(String[] args) {
		
		//����
		List<TravelCustomer> customerList = new ArrayList<>();
		
		//��ü ����
		TravelCustomer cumtomerLee = new TravelCustomer("�̼���",53,28000);
		TravelCustomer cumtomerKim = new TravelCustomer("������",25,35000);
		TravelCustomer cumtomerHong = new TravelCustomer("ȫ�浿",34,40000);
		
		//�߰�
		customerList.add(cumtomerHong);
		customerList.add(cumtomerKim);
		customerList.add(cumtomerLee);
		
		System.out.println("==�� ��� �߰��� ������� ���==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.print(s+" "));
		//mapToInt : Integer -> int
		System.out.println();
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("�� ���� : "+total);
				
		//filter : Ư�� ���ǿ� �´� �����͸� �ɷ�����
        System.out.println("==30�� �̻��� ���� �̸��� �����Ͽ� ���==");
        customerList.stream().filter(c->c.getAge()>=30).
        					  							map(c->c.getName()).sorted().
        					  							forEach(s->System.out.println(s));
		
		
	}

}

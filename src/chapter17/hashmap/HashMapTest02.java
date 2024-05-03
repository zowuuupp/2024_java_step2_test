package chapter17.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest02 {

	public static void main(String[] args) {
		// Map<String, Integer> ���� map
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//���� ������(����, ��ȣ)����
		map.put("�ֿ���", 1);
		map.put("�輺��", 2);
		map.put("�ۼ���", 3);
		map.put("������", 4);
		map.put("���", 5);
		map.put("���Ѽ�", 6);
		
		//������ �ο�
		System.out.println("�� �ο�: "+map.size());
		System.out.println();
		
		//������ �й��� �˾Ƴ���
		System.out.print("���� �й�: ");
		System.out.println(map.get("�ֿ���"));
		
		System.out.println();
		
		//��� ������ �й�
		Set<String> keySet = map.keySet(); // keySet()���� �� �޾Ƽ� �ߺ� �� �ǰ� ��ġ.
		Iterator<String> keyIterator=keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			int value=map.get(key);
			System.out.println("\t"+key+": "+value);
		}//while
		System.out.println();
		
	}

}

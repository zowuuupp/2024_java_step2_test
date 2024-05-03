package chapter17.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("김치", 85);
		map.put("홍길동", 90);
		map.put("박수", 98);
		map.put("동장군", 75);
		System.out.println("총 Entry 수 : "+map.size());
		
		//객체 찾기
		System.out.println("\t홍길동 : "+map.get("홍길동")); //90 , 메모리 주소?
		
		//객체 키 모두 받기
		Set<String> keySet=map.keySet(); // 다 받아서
		Iterator<String> keyIterator=keySet.iterator(); // 순환구조로 돌린다
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next(); //키받기
			Integer value=map.get(key); //키를 이용하여 값받기
			System.out.println("\t"+key+":"+value);
			
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : "+map.size());
		
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet(); // key 는 이름만, 얘는 이름이랑 value값이 같이 온다.
		
		Iterator<Map.Entry<String, Integer>> entryIterator=entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry=entryIterator.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : "+map.size());
		
	}

}

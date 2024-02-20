package ch13_CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx01_p573 {
	//field
	//constructor
	//method
	public static void main(String[] args) {
		
		//인터페이스 참조변수 = new 구현클래스명
		Map<String,Integer> map = new HashMap<String,Integer>();
	
		//객체 저장
		map.put("이순신",99);
		map.put("김구",100);
		map.put("세종대왕",100);
		map.put("광개토대왕",60);
		map.put("손흥민",90);
		/* 키값이 동일할 경우 덮어씌워짐
		map.put("손흥민",99);		*/
	
		//객체 찾기
		System.out.println(map.get("이순신"));
	
		//객체를 하나씩 처리
		Set<String>keySet=map.keySet();
		Iterator<String> iter=keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println(key+":"+value);
		}
	}
}

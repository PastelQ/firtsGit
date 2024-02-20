package ch13_CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx01 {
	public static void main(String[] args) {
		//클래스 참조변수 = new 클래스타입()
		//상위클래스 참조변수 = new 하위클래스()
		//인터페이스 참조변수 = new 구현클래스()
		
		Map<Object,Object> map = new HashMap<>();
		//저장된 수 확인, 사이즈 확인 
		System.out.println("* 저장된 수 확인, 사이즈 확인");
		System.out.println("map="+map);
		System.out.println("size()="+map.size());
		
		//put(Object K,Object V); 키&값 추가
		System.out.println("\n* 키&값 4개추가");
		map.put(1,100);//map.put(new Integer(1),new Integer(100));
		map.put(2.0,100);//map.put(new Double(2.0),new Integer(100));
		map.put(true, "문자열");//map.put(new Boolean(true),new String("문자열"));
		map.put('A','Z');//map.put(new Character('A'),new Character('Z'));
		
		//저장된 키의 수 확인
		System.out.println("size()="+map.size());
		
		//Object get(Object k):키를 이용하여 값을 가져오기
		System.out.println("\n* Object get(Object k):키를 이용하여 값을 가져오기");
		Object v1 = map.get(1);
		System.out.println(v1);//100
		
		int hashCode = v1.hashCode();
		System.out.println(hashCode);//100
		
		map.get(2.0);
		System.out.println(map.get(2.0));//100
		
		//Object remove(Object K):키를 이용하여 값을 삭제
		//해당하는 키가 존재하지 않으면 null 리턴
		System.out.println("\n* remove 키 사용");
		System.out.println("** 해당 키없을 경우 null 출력(하단)");
		System.out.println( map.remove('a'));
		
		//boolean containsKey(Object K):주어진 키가 있는 지 여부
		//주어진 키가 있으면 true
		System.out.println("\n* containsKey, remove 함께 사용");
		boolean r = map.containsKey(2.0);
		if(r) {
			map.remove(2.0);
			System.out.println("삭제되었습니다");
		}else {
			System.out.println("remove실패");
		}
		
		//모든 Key 조회
		//Set keySet():모든 Key를 Set객체에 담아서 리턴
		//Set<제네릭> keySet() > 제네릭 사용 시 
		System.out.println("\n* 모든 Key 조회");
		Set<Object> keySet=map.keySet();
		Iterator<Object> iter=keySet.iterator();
		while(iter.hasNext()) {
			Object key = iter.next(); 
			//Object get(Object K):키를 이용하여 값을 가져오기
			Object value=map.get(key);
			System.out.println(key+":"+value);
		}
		
		//모든 객체를 제거
		map.clear();
		System.out.println("\n* 모든 객체 제거:clear 진행 완료");
		
		if(map.isEmpty()) {
			System.out.println("** isEmpty를 통해 컬렉션이 비었는 지 확인 완료");
		}else {
			System.out.println("** 컬렉션 not empty");
		}
	}
}
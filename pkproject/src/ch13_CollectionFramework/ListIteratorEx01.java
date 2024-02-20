package ch13_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*Enumeration, Iterator, ListIterator
- 컬렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스
- Enumeration은 Iterator의 구버젼
- ListIterator는 Iterator의 접근성을 향상시킨 것 (단방향 → 양방향)

*Enumeration 
 - boolean hasNextElement(), Object nextElement()
*Iterator
 - boolean hasNext(), Object next() 
 */
public class ListIteratorEx01 {

	public static void main(String[] args) {
		List list0 = new ArrayList();
		list0.add("11");
		list0.add("12");
		list0.add("13");
		list0.add("14");
		list0.add("15");
		
		//Iterator는 단방향으로 이동되기 때문에
		//컬렉션의 마지막요소에 다다르면  더 이상 사용할 수 없다
		System.out.println("-ListIterator의 hasNext(),next()--");
		Iterator i = list0.iterator();
		while(i.hasNext()) {
			System.out.println( i.next() );
		}
		
		System.out.println("=========================");
		
		
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//listIterator는 양방향으로 이동이 자유롭다
		System.out.println("-ListIterator의 hasNext(),next()--");
		ListIterator it = list.listIterator();
		while(it.hasNext()) {  //순방향으로 진행된다
			System.out.println( it.next() );
		/*	Object o = it.next();
			String s = (String)o;  //String타입으로 강제형변환
			System.out.println(s.length());//String클래스의 필드와 메서드를 사용
		*/
		}
		
		System.out.println();
		System.out.println("-ListIterator의 hasPrevious(),previous()--");
		while(it.hasPrevious()) { //역방향으로 진행
			System.out.println( it.previous() );
		}
		
	}

}
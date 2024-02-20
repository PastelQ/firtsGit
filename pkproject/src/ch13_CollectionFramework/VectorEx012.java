package ch13_CollectionFramework;
//p556 CollectionFramework
/* 객체들을 효율적으로 추가,삭제,검색할 수 있도록 제공되는 컬렉션 라이브러리
-java.util 패키지에 포함 (import 필요)
-Interface를 통해서 정형화된 방법으로 다양한 컬렉션 class 이용

* List 컬렉션의 특징 및 주요 메서드
-특징:인덱스로 관리,중복하여 객체 저장 가능
-구현클래스:Vector,ArrayList,LinkedList

* Set 컬렉션의 특징 및 주요 메서드
-특징:수학의 집합에 비유,저장순서가 유지되지 않음,중복 저장 불가
	   하나의 null만 저장 가능
-구현클래스:HashSet,LinkedHashSet,TreeSet
-전체 객체 대상으로 한번씩 반복해 가져오는 반복자(Iterator) 제공
 인덱스로 객체를 검색하여 가져오는 메소드는 가지고 있지 않음
 
* Map 컬렉션의 특징 및 주요 메서드
 -특징:키(Key)와 값(Value)으로 구성된 Map.Entry 객체를 저장
 		하는 구조, 키는 중복 불가/값은 중복 가능
 -구현클래스:Hashtable,HashMap,LinkedHashMap,Properties,TreeMap */

import java.util.List;
import java.util.Vector;

/* Vector의 생성자
 Vector()
 Vector(int initialCapacity)
 Vector(int initialCapacity, int capacityIncrement) */
public class VectorEx012 {
	//Vector 생성자 2번째
	public static void main(String[] args) {
		/* Vector(int initialCapacity) : 
		  초기용량 지정/용량이 다 차면 2배씩 자동 증가 */
		
		//List vector = new Vector(); 다형성 적용 가능
		Vector vector = new Vector(5);
		//선언 후에는 데이터 없음 출력:[]
		System.out.println("new Vector()="+vector); 
		System.out.println("new Vector size="+vector.size()+"\n");
		
		//for문 이용하여 값 입력(value 10개 추가)
		System.out.println("Value를 10개 add");
		for(int i=1;i<=10;i++) {
			vector.add(i);
		}
		System.out.println("Capacity="+vector.capacity());
		System.out.println("Vector의 값 출력="+vector);
		System.out.println("Vector size 출력="+vector.size()+"\n");
		
		//value 5개 또 추가 
		//초기 Capacity가 10개로 용량 초과시 자동 2배로 Cap값 20
		System.out.println("Value 5개 또 add");
		for(int i=1;i<=5;i++) {
			vector.add(5);
		}
		System.out.println("Capacity="+vector.capacity());
		System.out.println("Vector의 값 출력="+vector);
		System.out.println("Vector size 출력="+vector.size()+"\n");
		
		/* Vector(int initialCapacity, int capacityIncrement)
		  초기용량 지정, 용량증가 지정						   */
	}
}

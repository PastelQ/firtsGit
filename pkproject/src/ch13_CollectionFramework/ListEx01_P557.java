package ch13_CollectionFramework;

import java.util.List;
import java.util.ArrayList;

//p556 CollectionFramework-List
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

/* 배열-장점)하나의 변수에 다수의 갯수 data를 저장
  	   단점)선언된 배열의 크기를 변경할 수 없음, 동일한 타입만 가능
  	  	   연속적인 공간에 저장하므로 중간에 삭제가 되면 찾기 어려움*/

public class ListEx01_P557 {

	public static void main(String[] args) {
		/*ArrayList를 선언
		클래스명 참조변수 = new 클래스명();
		ArrayList arrayList = new ArrayList(); */
		
		//다형성 적용 인터페이스 참조변수 = new 구현클래스
		/* 코드의 유연성
		  상위 인터페이스인 List로 다형성 적용, ArrayList 외에도
		  Vector,LinkedList 등 다른 구현클래스로 변경하거나
		  추가하기 용이함								  */
		List arrayList = new ArrayList();
		
		System.out.println("arrayList="+arrayList+" > 초기 인덱스 없음");
		int arrLen = arrayList.size();//인덱스 없음(초기값)
		
		//정수데이터 5개를 저장
		//데이터 추가-add() 임의 데이터를 추가
		for(int i=0;i<5;i++) {
			arrayList.add(i*12);
			/* 저장될 때 정수기본형 int -> Integer 박싱
			   다른타입도 저장 가능					  */
		}
		//특정인덱스에 저장된 데이터 가져오기-object get(인덱스)
		System.out.println("*특정 인덱스에 저장된 데이터 가져오기");
		System.out.println(arrayList.get(0)); //이렇게도 가능
		getList(arrayList); //하기 for문 메서드 사용
		
		//변경-set(indexNum,Value)
		System.out.println("*특정 인덱스 값 변경");
		arrayList.set(0,2);
		System.out.println(" > 확인 : "+arrayList.get(0)+"\n");
		
		//삭제-remove(indexNum) 데이터를 삭제
		System.out.println("*특정 인덱스 데이터 삭제");
		arrayList.remove(arrayList.size()-1);
		System.out.println(" > 확인(데이터 갯수size) : "+arrayList.size());
			/* 제시한 객체가 remove되었으면 true를 리턴
			   실패 시 false 반환					 */
		
		// clear():저장된 모든 객체 제거
		System.out.println("clear() 메소드 입력 후 지워졌나요?");
		arrayList.clear();
		/* isEmpty():빈 컬렉션인지 확인
		  비었다면 true, 데이터가 있다면 false 출력 */
		System.out.println(" > 확인 : "+arrayList.isEmpty()+"\n");
		
		//데이터의 갯수 출력
		System.out.println("*현재 데이터 갯수 출력");
		System.out.println(" > 확인 : "+arrayList.size());
	}
	
	private static void getList(List arr1) {
		for(Object temp : arr1) {
/* 타입이 Object인 이유:List타입은 다양한 타입을 저장할 수 있기에
 					integer타입만 들어갈 필요 없음
  arrayList.add(3.14);       실수타입
  arrayList.add("문자");  	 문자열타입
  arrayList.add('a');    	 char타입
  arrayList.add(true);       boolean타입
  arrayList.add(new Bird()); 객체 타입				 	*/	
			System.out.print(temp+"\s");
		}
		System.out.println("\n");//잘 됐나 Check
	}
}
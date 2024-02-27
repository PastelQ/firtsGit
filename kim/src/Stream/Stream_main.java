package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stream_main {

	public static void main(String[] args) {
		
		List<Integer> st = new ArrayList();
		st.add(4);
		st.add(2);
		st.add(3);
		st.add(1);
		st.add(5);
		/*
		//추가된 지 확인
		for(int i:st) {
			System.out.println(i);
		}
		//===================2보다 큰 수 추출
		List<Integer> list = new ArrayList();
			for(int i:st) {
				if(i>2) {
					list.add(i);
				}
			}
		//오름차순 정렬
		Collections.sort(list);
		System.out.println(list);
		*/
		st.stream().filter(i -> i>2)
				   .sorted()
				   //.forEach(System.out::println);
				   .forEach((Integer i) -> System.out.println(i));
	}
}

package Stream;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx01 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		list.add("Java");
		list.add("C");
		list.add("React");
		//기본적인 for문을 이용한 추출방법
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("아래는 람다식");
		
		//모두 람다식으로 줄인거지만 2번째가 많이씀
		list.stream().forEach((String str)-> System.out.println(str));
		list.stream().forEach(str -> System.out.println(str));
		list.stream().forEach(System.out::println);
	}
}

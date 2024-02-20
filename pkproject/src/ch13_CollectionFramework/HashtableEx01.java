package ch13_CollectionFramework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Hashtable(p576)
public class HashtableEx01 {

	public static void main(String[] args) {
	//Hashtable객체를 생성하여 임의의 이름 5개를 저장하여 console에 출력
	Map<String,String> nameMap = new Hashtable<String,String>();
	nameMap.put("001","박준영");
	nameMap.put("002","코골이");
	nameMap.put("003","황제펭귄");
	nameMap.put("004","조현병");
	nameMap.put("005","볼보사고차");

	//특정Key를 사용하여 브라우저에 출력(map참조변수.get(K);)
	String name = nameMap.get("003");
	System.out.println("*003회원명:"+ name+"\n===================");

	//Iterator 반복자를 이용하여 출력
	Set<String> keySet = nameMap.keySet();
	Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()){
			String key = iter.next();		//Key
			String value = nameMap.get(key);//Value
			System.out.println(key+":"+value);
		}
	}
}

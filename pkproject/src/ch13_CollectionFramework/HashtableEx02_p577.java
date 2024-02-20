package ch13_CollectionFramework;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//p577
/* 로그인 처리
 user로부터 id와 비번을 입력 받아
 (원래는 db의 회원table에 접속하여 특정회원id와 해당 비번을 비교해야 함)
 여기선 Hashtable에 저장된 특정회원id와 해당 비번을 비교
*/
public class HashtableEx02_p577 {
	
	public static void main(String[] args) {
		//데이터 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("==== Log in ====");
		System.out.println("# Insert ID :");
		String id = sc.nextLine();
		System.out.println("# Insert Password :");
		String pwd = sc.nextLine();
		
		
		//Hashtable에 회원 id와 비번
		Map<String,String> map = new Hashtable<String,String>();
		map.put("Spring","0000");
		map.put("Summer","0001");
		map.put("Auturm","0002");
		map.put("Winter","0003");
		
		//비즈니스 로직 수행
		//입력받은 내용과 저장된 내용이 일치하면 "로그인 성공"
		//그렇지 않으면 "로그인 Fail"
		String result = null;
	
		if(map.containsKey(id)) {
			String memberPwd = map.get(id);
			if(memberPwd.equals(pwd)) {
				result = "* Log in *";
			}else {
				result = "Pwd 불일치";
			}
		}
		System.out.println(result);
	}
}

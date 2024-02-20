package ch13_CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		Stack st = new Stack();
		//Queue는 인터페이스로 구현하는 클래스인 LinkedList 객체 생성
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		//LIFO Stack > 추출 시 나중 것부터
		System.out.println(" * Stack");
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		//FIFO Queue > 추출 시 처음 것부터
		System.out.println(" * Queue(LinkedList)");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
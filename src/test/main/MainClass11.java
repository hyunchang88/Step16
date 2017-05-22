package test.main;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 		HashSet
 * 		
 * 		- 순서가 없다.
 * 		- 키값도 없다.
 * 		- 중복을 허용하지 않는다.
 */
public class MainClass11 {
	public static void main(String[] args) {
		// HashSet 객체를 생성해서 참조값을 변수에 담기
		HashSet<String> set = new HashSet<String>();
		set.add("김구라");
		set.add("해골");
		set.add("원숭이");
		set.add("주뎅이");
		set.add("덩어리");
		set.add("김구라");
		set.add("주뎅이");
		// "" 안의 내용이 같으면 참조값이 같아.
		// 참조 값이 같으면 담기지가 않아 // 밑에 2개는 담기지 않음
		System.out.println("set.size() : "+set.size());
		
		// .iterator() 메소드를 이용해서 Iterator(반복자) 객체를 얻어온다.
		Iterator<String> it = set.iterator();
		// cursor 다음에 데이터가 있는지 확인해서 있는 동안에만 반복문을 수행한다.
		while(it.hasNext()){
			String tmp = it.next();
			System.out.println(tmp);
			// 출력은 되는데 순서가 없고 중복을 허용 안하는 것을 확인 할 수 있음
		}
	}
}

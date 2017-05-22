package test.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * 
 * 		[ Quiz 2 ]
 * 
 * 		1. Scanner 객체를 이용해서 문자열을 5번 입력 받아서
 * 		입력받은 문자열을 HashSet 객체에 저장하고
 * 
 * 		2. 저장된 문자열을 모두 콘솔창에 출력 해 보세요.
 */
public class MainClass14 {
	public static void main(String[] args) {

		// 퀴즈2
		Scanner scan=new Scanner(System.in);
		// 문자열을 저장 할 HashSet 객체 생성해서 참조값을 변수에 담기
		Set<String> set = new HashSet<>();
		for(int i=0; i<5; i++){
			System.out.print("메세지 입력:");
			String msg=scan.nextLine();
			// HashSet 객체에 저장
			set.add(msg);
		}
		
		// 반복자 객체 얻어내서
		Iterator<String> it = set.iterator();
		// 반복문 돌면서 출력하기
		while(it.hasNext()){
			String tmp = it.next();
			System.out.println(tmp);
		}
	
	}
}

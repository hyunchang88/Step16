package test.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/*
 * 		[ Quiz 1 ]
 * 
 * 		1. Scanner 객체를 이용해서 문자열을 5줄 입력 받아서
 * 		입력받은 문자열을 ArrayList 객체에 저장하고
 * 
 * 		2. 저장된 문자열을 순서대로 콘솔창에 출력 해 보세요.

 */
public class MainClass13 {
	public static void main(String[] args) {
		
		// 퀴즈 1 내가 한것
//		Scanner scan = new Scanner(System.in);
//		List<String> nums = new ArrayList<>();
//		for(int i = 0; i < 5; i++){
//			System.out.print("저장할 문자열 : ");
//			String word = scan.nextLine();
//			nums.add(word);
//		}
//		
//		System.out.print("저장된 문자열배열 : "+nums);
		
		// 퀴즈 1 강사님 소스
		Scanner scan=new Scanner(System.in);
		//문자열을 저장할 ArrayList 객체를 생성해서 참조값 변수에 담기
		List<String> msgs=new ArrayList<>();
		//반복문 돌면서 문자열 5번 입력 받아서 ArrayList 객체에 저장
		for(int i=0; i<5; i++){
			System.out.print("메세지 입력:");
			String msg=scan.nextLine();
			msgs.add(msg);
		}
		//ArrayList 객체에 저장된 문자열 콘솔에 출력해보기
		for(String tmp:msgs){
			System.out.println(tmp);
		}
	
		
	}
}

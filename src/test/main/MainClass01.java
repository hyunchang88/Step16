package test.main;

import java.util.ArrayList;

import test.mypac.Apple;

public class MainClass01 {
	public static void main(String[] args) {
		// Apple 객체를 저장할 수 있는 가변 배열 객체 생성
		ArrayList<Apple> apples=new ArrayList<Apple>();
		// Apple 객체를 생성해서 참조값을 저장한다.
		apples.add(new Apple());
		apples.add(new Apple());
		apples.add(new Apple());
		apples.add(new Apple());
		apples.add(new Apple());
		// 가변 배열객체의 방의 갯수 참조 해 보기
		int result = apples.size();
		
	}
}

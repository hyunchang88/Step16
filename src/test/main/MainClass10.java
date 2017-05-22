package test.main;

import java.util.ArrayList;
import java.util.Random;

/*
 * 		실행 했을때 
 * 
 * 		로또 번호 6개를 무작위로 콘솔창에 출력하는 코드를 작성해 보세요.
 * 
 *  	로또번호 : 1~45 범위의 숫자중에서 중복되지 않는 6개의 숫자
 */

public class MainClass10 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		//ran.nextInt(45); // 0~44
		
		// int를 저장 할 수 있는 방 6개짜리 배열 객체 생성
		int[] nums = new int[6];
		
		for(int i=0 ; i<6 ; i++){
			// 1~45 사이의 랜덤한 정수 값을 얻어내서
			int ranNum = ran.nextInt(45)+1;
			
			// 배열에 순서대로 저장한다.
			nums[i]=ranNum;
			
			//배열에 ranNum 과 같은 숫자가 있는지 체크한다.
			for(int j=0; j<i; j++){
				if(nums[j]==ranNum){ // 이미 숫자가 존재하면
					// 현재 i 번째 방의 숫자를 다시 추출하도록 i 를 1 감소
					i--;
					break; // 가장 가까운 반복문 탈출
				}
			}
		}

		//출력하기
//		for(int i=0; i<6; i++){
//			System.out.print(nums[i]+" | ");
//		}
		//출력하기2
		for(int tmp : nums){
			System.out.print(tmp+" | ");
		}
		
		
	}
}


package test.main;

import java.util.ArrayList;
import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		// Car 객체의 참조값을 담을수 있는 ArrayList 객체를 생성해서
		// 참조값을 변수에 담아 보세요.
		ArrayList<Car> cars=new ArrayList<Car>();
		// 위에서 생성한 ArrayList 객체에 Car 객체의 참조값을 3개 저장해 보세요.
		cars.add(new Car("sm5"));
		cars.add(new Car("k3"));
		cars.add(new Car("genisis"));
		
		// 반복문 for 를 이용해서 cars 배열에 저장된 Car type 의 참조값을
		// 하나씩 불러와서 drive() 메소드를 호출해 보세요.
		for(int i=0; i<cars.size(); i++){
			cars.get(i).drive();
//			Car tmp = cars.get(i);
//			tmp.drive();
		}
		// 위의 반복문과 같은 것.
		for(Car tmp : cars){
			tmp.drive();
		}
	}
}

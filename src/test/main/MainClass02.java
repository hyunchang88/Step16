package test.main;

import java.util.ArrayList;
import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// Car 객체의 참조값을 담을수 있는 ArrayList 객체를 생성해서
		// 참조값을 변수에 담아 보세요.
		ArrayList<Car> cars=new ArrayList<Car>();
		// 위에서 생성한 ArrayList 객체에 Car 객체의 참조값을 3개 저장해 보세요.
		cars.add(new Car("sm5"));
		cars.add(new Car("k3"));
		cars.add(new Car("genisis"));
		
		Car car1 = cars.get(0);
		Car car2 = cars.get(1);
		Car car3 = cars.get(2);
		
		car1.drive();
		car2.drive();
		car3.drive();
		
	}
}

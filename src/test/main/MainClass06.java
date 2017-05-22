package test.main;

import java.util.HashMap;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		// HashMap 객체의 두번째 Generic class  를 Object 로 지정하면
		// 모든 type 데이터를 저장할 수 있다.
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("num", 1);						// int (Integer)
		map.put("name", "김구라");				// String
		map.put("isMan", true);					// boolean (Boolean)
		map.put("Car", new Car("Benz"));	// Car
		
		// 리턴 type 이 Object 이므로 원래 type 으로 casting 한다.
		map.get((int)map.get("num"));
		String name = (String)map.get("name");
		boolean isMan = (boolean)map.get("isMan");
		Car car = (Car)map.get("car");
		
	}
}

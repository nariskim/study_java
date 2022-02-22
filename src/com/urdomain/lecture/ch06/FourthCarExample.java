package com.urdomain.lecture.ch06;

public class FourthCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FourthCar fourthCar = new FourthCar();
		
		fourthCar.setGas(5);	//Car의 setGas() 메소드 호출
		
		boolean gasState = fourthCar.isleftGas();	//Car의 isleftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			fourthCar.run();//Car의 run() 메소드 호출
		}if(fourthCar.isleftGas()) {
			System.out.print("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}

}

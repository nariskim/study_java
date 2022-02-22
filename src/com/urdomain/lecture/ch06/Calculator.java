package com.urdomain.lecture.ch06;

public class Calculator {

	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public int plus(int a, int b) {
		int result = a + b ;
		return result;
		
	}
	
	public double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}

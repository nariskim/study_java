package com.urdomain.lecture.ch06.T;

public class Computer extends Calculator {

	@Override
	public double circleArea(int r) {

		return super.circleArea(r);
	}

	public double circleArea2(int r) {
		double pai2 = Constants.PAI_2;
		double result2 = pai2 * r * r;
		return result2;

	}

}

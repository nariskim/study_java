package com.urdomain.lecture.ch06;

public class EarthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("지구의 반지름 :" + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 :" + Earth.EARTH_SURFACE_AREA + "km^2");
	
		Earth earth = new Earth();
		System.out.println("earth.EARTH_RADIUS : " + earth.EARTH_RADIUS);
		
		System.out.println("Math.PI : " + Math.PI);
	}

}

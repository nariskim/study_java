package com.urdomain.lecture.ch07;

public abstract class Animal {

	//생성자
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	
	@Override
	public void sound(String aaa) {
		System.out.println("야옹" + aaa);
	}
}

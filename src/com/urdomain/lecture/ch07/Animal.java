package com.urdomain.lecture.ch07;

public abstract class Animal {

	//생성자
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	
	public abstract void sound();
//	public abstract void sound(String m);
}

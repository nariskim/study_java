package com.urdomain.lecture.ch08;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		
//		Audio audio = new Audio();
		Television television = new Television();
		
		television.turnOn();
		television.turnOff();
		
		System.out.println();
		
//		interface를 구현한 class는 위에 처럼 일반 클래스 객체 만들듯이 하면 안됨.

//		interface를 구현한 class를 사용해야 함.
//		RemoteControl remoteControl;	//인터페이스 변수 선언
//		remoteControl = new Audio();	//구현 객체로 초기화
		
//		RemoteControl remoteControl = new Audio();	//더 많이 사용
		RemoteControl remoteControl = new Television();
		
		remoteControl.turnOn();
		remoteControl.turnOff();
	}

}

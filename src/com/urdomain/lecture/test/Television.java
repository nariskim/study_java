package com.urdomain.lecture.test;

public class Television implements RemoteControl {

	private int volume;

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

	public int getVolume() {
		return volume;
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}
}

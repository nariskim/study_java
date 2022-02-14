package com.urdomain.lecture.ch04;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			
//			Math.random() * (max - min + 1) + min
//			0.0 ~ (about)1.0에 가까운 double형 변환
			
			int num = ((int)(Math.random()*6) +1); //1부터 6까지
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("process ended!");
	}

}

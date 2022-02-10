package com.urdomain.lecture.ch04;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 75;
		
		if(score >= 90) {
			
			System.out.println("점수가 90~100 사이 입니다");
			System.out.println("등급은 A 입니다. 매우 잘하셨습니다. 장학금 대상자 입니다.");
		} else if(score >=80){
			System.out.println("점수가 80~89 사이 입니다");
			System.out.println("등급은 B 입니다. 잘하셨습니다.");
			
		} else if(score >=70){
			System.out.println("점수가 70~79 사이 입니다");
			System.out.println("등급은 C 입니다. 좀 더 노력하시면 좋은 점수를 얻을 수 있습니다");
			
		} else if(score >=60){
			System.out.println("점수가 60~69 사이 입니다");
			System.out.println("등급은 D 입니다. 분발하세요.");
			
		}  else {
			System.out.println("점수가 59보다 작습니다");
			System.out.println("등급은 E 입니다. 재시험 대상자 입니다.");
			
		}
		
		int a = 10;
		int b = 9;
		
		if (a>b) {
			System.out.println("a>b");
		}
		if (a<b) {
			System.out.println("a<b");
		}
		if (a==b) {
			System.out.println("a==b");
		}
		
		
	}

}

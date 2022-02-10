package com.urdomain.lecture.ch03;

public class conditionalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 85;
//		char grade = (score > 90 ? 'A' : 'B');
		char grade = (score > 90 ? 'A' : (score > 80 ? 'B' : 'C'));
		System.out.println("grade : " + grade);

//		String str = "김나리";
//		String str1 = (str1.equals("김나리") ? );
	}

}

package com.urdomain.lecture.ch04;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		
//		if(score >= 95) {
//			if(score >= 95) {
//				grade = "A+";
//			}  else if(score >=90){
//				grade = "A";
//			}else if(score >=85){
//				grade = "B+";
//			}else if(score >=80){
//				grade = "B";
//			}else if(score >=75){
//				grade = "C+";
//			}else if(score >=70){
//				grade = "C";
//			}else if(score >=65){
//				grade = "D+";
//			}else if(score >=60){
//				grade = "D";
//			}
//			}else {
//				grade = "F";
//			}
//			
		int score = 40;
		String grade = "";
		
		if(score>=90) {
			if(score >= 95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}else if(score>=80) {
			if(score >= 85) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}else if(score>=70) {
			if(score >= 75) {
				grade = "C+";
			}else {
				grade = "C";
			}
		}else if(score>=60) {
			if(score >= 65) {
				grade = "D+";
			}else {
				grade = "D";
			}
		} else {
				grade = "F";
		}
		System.out.println("학점은 : " + grade);	
		
	}

}

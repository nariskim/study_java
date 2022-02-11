package com.urdomain.lecture.ch04;

public class ForPrintFromTo10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
////		초기화식 i = 1
////		조건식 i <= 10
////		증감식 i ++
//		
//		
//		for(int i=1; i<=10; i++) {	
//			System.out.println(i);
//		}
//		int sum = 0;
//		for(int i = 1; i <= 10; i++) {
//			 sum += i; 
////			sum = sum + i;
//		}
//			System.out.println(sum);
//	
//			--------------------------------
//			
//			for() {
//				for() {
//					for() {
//						for() {
////							------ 무한가능
//						}
//					}
//				}
//			}
//			
//			for (int i =1; i<=10; i++) {
//				System.out.println(i);
//					for(int j = i; j <=10; j++) {
//						System.out.println(j);
//					}
//			}
	
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");

			for (int j = 1; j < 10; j++) {

				System.out.println(i + "X" + j + "=" + (i * j));
			}
		}
	}

}

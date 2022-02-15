package com.urdomain.lecture.ch05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[5];

		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
			
		}
		
		
//		System.arraycopy(arr1, 0, arr2, 0,arr1.length); //카피할 객체 카피할객체 0부터 카피받을 객체 카피받을객체 0부터 어디까지 카피
//		
//		for(int i=0; i<arr2.length; i++) {
//			
//			System.out.println(arr2[i]);
//		}
	}

}

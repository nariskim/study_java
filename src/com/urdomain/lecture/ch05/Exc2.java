package com.urdomain.lecture.ch05;

public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2 부터 9 까지 정수형 배열 변수 2개를 만들고
		//for 문을 사용하여 구구단 출력을 하세요.
		
		int [] arr1= new int [8];	
		for (int i=0; i<arr1.length; i++) {
			arr1[i] = i+2;
			int [] arr2= new int[9];
			for(int j=0; j<arr2.length; j++) {
				arr2[j] = j+1;
				int x= arr1[i]*arr2[j];
				System.out.println(arr1[i] + "X" + arr2[j] + "=" + x);
			}

			System.out.println();
		}
		
	}

}
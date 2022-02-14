package com.urdomain.lecture.ch04;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[6];

		for (int i = 0; i <46; i++) {
			int num = (int) (Math.random() * 45) + 1;
			array[i] = num;
			for (int j = 0; j < i; j++) {
				if (i == j) {
					i--;
					break;
				}
			}
			
			System.out.print(array[i] + " ");
		}

	}

}

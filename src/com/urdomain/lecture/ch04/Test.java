package com.urdomain.lecture.ch04;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i < 10; i++) {
			System.out.println(i);

			for (int j = 1; j < 10; j++) {

				System.out.println(i + "X" + j + "=" + (i * j));
				int ij = i*j;
				int sum = 0;
				
				if (ij % 2 == 0) {
					sum += ij;
					System.out.println(sum);
					
				}else {
					System.out.println(sum);
				}

			}
		}
		

	}

}
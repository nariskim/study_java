package com.urdomain.lecture.ch02;

public class GarbageValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i < 5 ; i++) {
			var1++; //126
			var2++; //126
			System.out.println(i + " : var1 : " + var1 + "\t" + "var2 : " + var2);
	}

}
}
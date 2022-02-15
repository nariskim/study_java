package com.urdomain.lecture.ch05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = new String[3]; //갯수 정해놓고 아직 데이트 입력 x
		
		strArray[0] = "김로쑝";
		strArray[1] = "김로쑝";
		strArray[2] = new String("김로씨옹");

//		String atrArray1 = "김나리";		
//		String atrArray1 = "김로쑝";		
//		String atrArray1 = new String(김로키);		
		
		for(int i=0; i<strArray.length; i++) {
			
			System.out.println(strArray[i]);
		}
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		
		
		System.out.println(strArray[0].equals(strArray[1]));
		System.out.println(strArray[0].equals(strArray[2]));
		
		
// 		equals : String 객체의 함수 : 문자열비교

	
		
		
		
	}

}

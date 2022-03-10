package com.urdomain.lecture.ch10;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;

//		System.out.println(args[0]);

		try {

			data1 = args[0];
			data2 = args[1];

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;

			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (Exception e) {
			System.out.println("오류난다..어디일까????????");
		} finally {
			System.out.println("finally");
		}
	}
}

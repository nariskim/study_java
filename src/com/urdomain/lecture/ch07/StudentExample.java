package com.urdomain.lecture.ch07;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student("Nari", "1234-5678", 21);

		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);

		Student student2 = new Student("Ryeongeun", "0000-9999");

		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println(student2.studentNo);

	}

}

package com.urdomain.lecture.ch06;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Person person = new Person ("123456-7891011","고경표");
		
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		
		
		person.name = "주지훈";
		System.out.println(person.name);
	}

}

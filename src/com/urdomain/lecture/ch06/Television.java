package com.urdomain.lecture.ch06;

public class Television {

	
	public static String company ="LG";
	
	public static String model="Signature";
	
	public static String info;
	
	public String version = "1.0";
	
	static {
		info = company + "" + model;
//		info = company + "" + model + version;	//error
	}
}

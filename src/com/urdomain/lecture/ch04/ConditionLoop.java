package com.urdomain.lecture.ch04;

public class ConditionLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		조건문 
//			if
//					if 만 사용하는 경우 :
//					if (조건식) {
		
					
				
//					조건이 true/false 로  떨어지는 경우
//					if (조건식) {
//						
//					} else {	//else 에는 조건식을 널지 않는다.
//						
//					}
//		
//					조건이 많은 경우
//					if (조건식) {
//						
//					} else if (조건식) {
//						
//					} else if (조건식) {
//						
//					} else {
//						
//					}
//					
//					번외
//					if 안에 또 if를 넣을 수 있을까? 있습니다. 몇개까지 ? 무한대
//							if () {
//								if() {
//									if() {
//										...
//									}
//								}
//							}
//							
//					switch
						조건에
					
//					
//					반복문
//					
//					for
//					
//					while : 단점 무한루프
//					
//					do-while
//						
//					참고
//					
//					break
//					
//					continue
			
	
	int a = -5;
	int b = - 10;
	String qd = "";
	
	
	if (a>0) {
		if(b>0) {
			qd="Quadrant 1";
			}else {
				qd="Quadrant 4";
		}
		
	}else {
		if(b>0) {
			qd="Quadrant 2";
			}else {
				qd="Quadrant 3";
			}
		
		}
	
		System.out.println(qd);
	
	}
}



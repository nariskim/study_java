package com.urdomain.lecture.ch04;

public class ConditionLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		조건문 
//			if
//					if 만 사용하는 경우 :
//					if (조건식) {
//					}
		
					
				
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
//						case
//						break
//						default
//						break
					
//					
//					반복문
//					
//					for(int i=1; int<=10; i++)(초기화; 조건식; 증감식)
//					
//					while : 단점 무한루프
//					
//					do-while
//						do {
//						} while (1 <= 10); 
//						
//						
//					참고
//					
//					break
//						if문과 같이 쓰임
//						루프문 탈출
//						필요한 경우 라벨을 사용하여 상위 루프 탈출 가능 
//			
//					continue
//						if문고 ㅏ같이 쓰임
//						for 문 인 경우 증감식으로
//						while, do-while 인 경우에는 조건식으로 이용
		
			
	
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



package com.urdomain.lecture.ch03;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 연산자 : + , - , * , / , % , ...
		// 피연산자 : 데이터
		// c = a + b;

		// 연산의 방향
		// <-- : right to left : 증강, 부호, 비트, 논리, 대입
		// --> : left to right : 산술, 쉬프트, 비교, 논리, 조건 (일반적방법)

		// 연산의 우선순위
		// 증감( ++, --), 부호(+, -), 비트(~), 논리(!)
		// 산술(*, /, %)
		// 쉬프트(<, >, <<, >>>)
		// 비교(<, >, <=, >=, instenceof)
		// 비교(==, !=)
		// 논리(&)
		// 논리(^)
		// 논리(|)
		// 논리(&&)
		// 논리(||)
		// 조건(?)
		// 대입(=, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=)

		// ***** ()로 적절히 우선 순위를 잡아서 사용하는 것이 중요 *****

		// 항 = 피연산자 = 데이터

		// 단항연산자 (피연산자가 한개인것)
			// 부호연산자(+, -)
			//	+ : 현행 부호 유지
			//	- : 현행 부호 변경
		
		
			// 증감연산자(++, --) ***
			// 논리부정연산자(!) *****
			// 비트반전연산자(~)
		
		
		// 이항연산자(피연산자가 두개인것)
			// 산술연산자(+, -, *, /, %) *****
			// int 보다 작은 타입들은 int로 형변환 되어 연산 됨
			// 연산 중에 큰 타입이 있으면 작은 타입은 큰타입으로 변환 되어 연산 됨
			// 오버플로우 : 연산 후 산출 값이 산출 타입에서 충분히 저장이 가능한지 검토가 필요하며
			// 이 범위를 벗어나면 가장 근사치 값 또는 쓰레기 값이 저장 되어 연산이 부정확하게 됨 
		
			// 문자열연결연산자(+) *****
		
		
			// 비교연산자 *****
			// 동등비교(==, !=)
			// 크기비교(<, >, <=, >=)
			// String비교
		
		
			// 논리연산자(&&, ||, &, |, ^, !) *****
		
			// 비트연산자(<<, >>, >>>)
		
			// 대입연산자
			// 단순대입(=) *****
			// 복합대입연산자(+=, -=, *=, /=, %=, 등등) **
		
		// 삼항연산자 (피연산자가 세게인것)
		// (? : ) **
		
		
		// c = a + (b + c);
		// c = (a + b) + c;

	}

}

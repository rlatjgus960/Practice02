package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

			
		Scanner sc = new Scanner (System.in);
		
		int age = sc.nextInt(); //int값을 스캐너로 받아야됨
		
		//age가 0살 초과이고 18살 미만이면 
		// && 사용해서 age에 대한 정의를 두가지로 나눠줘야 함(둘 다 만족해야하므로 && 사용)
		if(0<age && age<18) {
			System.out.println("청소년 입니다.");
			
		}
		
		sc.close();

	}

}

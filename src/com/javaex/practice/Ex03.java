package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		int age;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if (age>20) {
			System.out.println("\"1번그룹\"");
		}else {
			System.out.println("\'2번그룹'\"");
		}
		System.out.println("입니다.");
		
		sc.close();
		
		//코드 실행결과 예상 : 15,19,20 입력시 '2번그룹'" // 21, 100 입력시 "1번그룹"
	}

}

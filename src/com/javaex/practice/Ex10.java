package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("사번(정수)을 입력해주세요");
		System.out.print("사번: ");
		int num = sc.nextInt();

		
		if (num>0 && num%3==0) {
			System.out.println("A팀입니다.");
		}else if(num%3==1) {
			System.out.println("B팀입니다.");
		}else if(num%3==2) {
			System.out.println("C팀입니다.");
		}else {
			System.out.println("잘못된 값입니다.");
		}
		
		sc.close();

	}

}

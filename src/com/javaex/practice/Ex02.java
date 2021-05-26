package com.javaex.practice;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		//x가 0과 같으면
		
		//괄호 안에 = 하나만 하면 안됨 ==로 변경
		if (x==0) {
			System.out.println("x는 0이다.");
		}
		
		sc.close();

	}

}

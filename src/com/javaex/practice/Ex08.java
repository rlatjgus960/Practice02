package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		System.out.print("숫자3: ");
		int num3 = sc.nextInt();
		
		
		if (num1>num2 && num2>num3) {
			System.out.println("가장 작은수는 "+num3+" 입니다.");
		}else if(num3>num2 && num2>num1) {
			System.out.println("가장 작은수는 "+num1+" 입니다.");
		}else if(num3>num1 && num1>num2) {
			System.out.println("가장 작은수는 "+num2+" 입니다.");
		}
		
		sc.close();
	}
}

package com.javalec.base;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		// 12번. 배열의 삽입.
		// 몇개의 숫자를 입력할지 결정한 후 숫자를 입력하고 입력된 위치에 새로운 숫자를 삽입
		
		Scanner scanner = new Scanner(System.in);
		int count = 0; //입력 갯수
		int[]number;   //입력 저장 배열
		int position = 0; //삽입 위치
		int insNum = 0; //삽입숫자
		
		System.out.print("입력할 숫자의 갯수 : ");
		count = scanner.nextInt();
		number = new int[count+1];
		
		System.out.println(count + "개의 숫자를 입력하세요 : ");
		
		for(int i=0; i<count; i++) {
			System.out.print((i+1) + "의 숫자 : ");
			number[i] = scanner.nextInt();
		}
		
		System.out.print("숫자를 삽입하고자 하는 위치는 ? ");
		position = scanner.nextInt();
		
		System.out.print("삽입하고자 하는 수는 ? ");
		insNum = scanner.nextInt();
		
		// --
		for(int i=count-1; i>=position-1; i--) {
			number[i+1] = number[i];
		}
		
		number[position-1] = insNum;
		
		
		System.out.println("-----결과-----");
		for(int i=0; i+1<count; i++) {
			System.out.println(String.format("%3d", number[i]));
		} 
		
		
		
		
		
		
		

	}

}

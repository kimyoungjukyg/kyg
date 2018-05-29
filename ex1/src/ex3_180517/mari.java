package ex3_180517;

import java.util.Scanner;

import ex2_180516.scanner;

public class mari {

	public static void main(String[] args) {
		
		
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner sc=new Scanner(System.in);
		String Ao;
		
		do{
		System.out.print(">");
		Ao=sc.nextLine();
		System.out.println(Ao);
		}while(!Ao.equals("q"));
		System.out.println();
		System.out.println("프로그램종료");


	}

}

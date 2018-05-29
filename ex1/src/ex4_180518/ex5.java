package ex4_180518;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		int a=(int)(Math.random()*100)+1;
		int b=0;
		int n=0;
		Scanner sc=new Scanner(System.in);
		
		
		do {System.out.println("1과 100사이의 값을 입력하세요: ");
		b=sc.nextInt();
		n++;
		 if(a>b) {
				System.out.println("더 큰 값을 입력하세요");
				
			
			}else if(a<b) {
				System.out.println("더 작은 값을 입력하세요");
				
			}}
		while(a!=b); {
			
		
			System.out.println("맞췄습니다.");
			System.out.println("시도횟수는 "+n+"회 입니다.");
			
	}
		
		
		}
	}



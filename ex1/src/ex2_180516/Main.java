package ex2_180516;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N;
		int a;
		int b;
		System.out.println("몇 킬로인지 입력하시오");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		if(N%5==3) {
		System.out.println("5킬로봉지 수:"+N/5+"개 "+"3킬로봉지 수:"+(N%5)/3);}
		else{System.out.println(-1);}
		

	}

}


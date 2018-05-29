package ex3_180517;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int a;
		int n=0;
		double sum=0;
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(a!=0) {
			n++;
			a=sc.nextInt();
			sum+=a;
		}
		System.out.println("수의 계수는 "+n+"개이며 평균은"+sum/n+"입니다.");

	}

}
/* 
 * 
 * while(true){
n=scanner.nextInr()
if(n==0)
break;
count++;
*/










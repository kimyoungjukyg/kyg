package ex3_180517;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int sum=0;
		int A;
		int B;
		System.out.print("더하고 싶은 범위의 숫자의 처음과 마지막 값을 입력하세요");
		Scanner sc=new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		for(int a=A; a>=A && a<=B; ++a) {
			sum+=a;
			if(a>=A) {
			System.out.print(a+"+");}
			else if(a==B) {
				System.out.print(a);
			}else {;}
			
		}
		System.out.print("="+sum);
		sc.close();
	}

	}


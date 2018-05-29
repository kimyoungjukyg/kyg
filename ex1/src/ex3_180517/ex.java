package ex3_180517;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		int sum=0;
		int A;
		System.out.print("더하고 싶은 숫자를 입력하세요");
		Scanner sc=new Scanner(System.in);
		A=sc.nextInt();
		for(int a=1; a<=A; a++) {
			sum+=a;
			if(a<A) {
			System.out.print(a+"+");}
			else if(a==A) {
				System.out.print(a);
			}else {;}
			
		}
		System.out.print("="+sum);
		sc.close();
	}

}

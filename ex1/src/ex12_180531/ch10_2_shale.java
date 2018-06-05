package ex12_180531;

import java.util.Scanner;

public class ch10_2_shale {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a;
	int b;
	 a=sc.nextInt();
			 b=sc.nextInt();
			 
			try { int sum=a/b;
			 System.out.println(sum);}catch(ArithmeticException e) {
				 System.out.println("알수없음");
			 }
}
}

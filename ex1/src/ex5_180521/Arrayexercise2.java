package ex5_180521;

import java.util.Scanner;

public class Arrayexercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {500,100,50,10};
	    int b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("금액을 입력하시오:");
		b=sc.nextInt();
			for(int i=0;i<a.length;i++) {
			int c=b/a[i];
			System.out.println(a[i]+"원 동전: "+c+"개");
			b=b%a[i];
			}
		
	
		}

	}



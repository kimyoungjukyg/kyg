package ex3_180517;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		int a;
		int sum=0;
		System.out.print("마지막 값을 입력하세요");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int b=1;b<=a;b++) {
			if(!(b%2==0 || b%3==0)) {
				sum+=b;
				
			}
		}System.out.print("총합: "+sum);
	
		
		
	}

}
/*
 * Scanner sc = new Scanner(System.in);
 * int sum=0;
 * int num=sc.nextInt();
 * for(int i=1; i<=num; i++){
 *  //2의배수로판단:n%2==0,3의배수 판단n%3==0
 *  if(num%2 !=0 && num%3 !=0)
 * {sum+=num;} }System.out.println("합"+sum);
 * }
 * 
 * 
 * */

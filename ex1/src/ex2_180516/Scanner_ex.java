package ex2_180516;

import java.util.Scanner;

public class Scanner_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("초를 입력하세요");
		s=sc.nextInt();
		a=s%3600;
		System.out.println(s+"초는"+s/3600+"시간"+a/60+"분"+a%60+"초입니다.");
		
		
		

	}

}

package ex2_180516;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r;
		
		System.out.println("원의 반지름을 입력하세요:");
		r=sc.nextInt();		
		System.out.println("원의 면적은"+ r*r*3.14+"입니다.");
		//pi를 사용하기위해서는 Math.pi사용

	}

}

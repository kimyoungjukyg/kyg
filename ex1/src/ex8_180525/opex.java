package ex8_180525;

import java.util.Scanner;

public class opex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		op A=new op();
		op B1=new op();
		
		System.out.println("이름 국어성적 영어성적 수학성적을 순서대로 입력하시오");
	
	A.name=sc.nextLine();
	A.kscore=sc.nextInt();
	A.escore=sc.nextInt();
	A.mscore=sc.nextInt();
	System.out.println("이름 국어성적 영어성적 수학성적을 순서대로 입력하시오");
	B1.name=sc.nextLine();
	B1.kscore=sc.nextInt();
	B1.escore=sc.nextInt();
	B1.mscore=sc.nextInt();
		
A.result();

		B1.result();
		

	}

}

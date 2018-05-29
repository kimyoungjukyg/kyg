package ex3_180517;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		int A;
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.print("점수 학년을 입력하시오");
		A=sc.nextInt();
		year=sc.nextInt();
		
if(year==4 && A>=70) {
	System.out.println("합격입니다.");
}else if(year==4) {
	System.out.println("불합격입니다.");
}else if(3>=year) {


if(A>=60) {
	System.out.println("합격입니다.");
}else {
	System.out.println("불합격입니다.");
}}
else {
	System.out.println("점수 학년에 오류가 있습니다.");}

	}

}

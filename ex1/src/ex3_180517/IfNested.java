package ex3_180517;

import java.util.Scanner;

//중첩 if
public class IfNested {

	public static void main(String[] args) {
	/*
	 * 점수를 입력받고
	 * 90점이상인점수에대해 95이상이면A+
	 * 90이상 95미만이면A
	 * 85 89 b+
	 * 84 80 b
	 * 75 79 c+
	 * 70 74 c
	 * 65 69 d+
	 * 60 64 d
	 * 60 f
	 * if가끝나면 학점을 출력하는 print문사용
	 * 주의할점은 학점값을 처리하는 String 타입의 변수하나사용
	 */
int sco;
String b; 
Scanner sc=new Scanner(System.in);
System.out.print("당신의 점수를 입력하세요");
sco=sc.nextInt();
if(sco>=95) {b="A+";}
else if(sco>=90) {b="A";}
else if(sco>=85) {b="B+";}
else if(sco>=80) {b="B";}
else if(sco>=75) {b="C+";}
else if(sco>=70) {b="C";}
else if(sco>=65) {b="D+";}
else if(sco>=60) {b="D";}
else {b="F";}
		
	System.out.println("당신의 학점은"+b+"입니다.");	
		
	}

}

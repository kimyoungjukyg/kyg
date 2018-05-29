package ex3_180517;

import java.util.Scanner;

public class Ifelse2 {

	public static void main(String[] args) {
		/*
		 점수를 스캔으로 입력받아
		 90이상이면 점수가90-100 등급a
		 80이상 90미만이면 점수가 80-89 등급b
		  70이상 80미만이면 점수가 70-79 등급c
		   60이상 70미만이면 점수가 60-69 등급d
		   60미만이면  60미만 재수강 f
		 */
int score;
Scanner sc=new Scanner(System.in);
System.out.print("점수를 입력하세요");
score=sc.nextInt();
if(score>=90) {
	System.out.println("점수는 90~100입니다.");
	System.out.println("등급은A");
}else if(score>=80){
	System.out.println("점수는 80~89입니다.");
	System.out.println("등급은B");
}else if(score>=70) {
	System.out.println("점수는 70~79입니다.");
	System.out.println("등급은C");
}else if(score>=60) {
	System.out.println("점수는 60~69입니다.");
	System.out.println("등급은D");
}else {
	System.out.println("점수는 60미만입니다.");
	System.out.println("등급은F 재수강입니다.");
}

	sc.close();		
		
		
	}}

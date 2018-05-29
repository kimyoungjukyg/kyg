package ex2_180516;

import java.util.Scanner;
/*
 * next() 문자열입력
 * netInt() 정수입력
 * nextDouble() 실수입력
 * close() 스캐너종료
*/
public class scaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String name;
		System.out.println("당신의 이름은?");
		name=sc.next();//.next() :문자열  입력을 위한 스캐너의 메소드
		System.out.println("당신의 이름은"+name+"입니다");
sc.close();
	}

}

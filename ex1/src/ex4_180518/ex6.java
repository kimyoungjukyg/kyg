package ex4_180518;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		int c=0;//잔고
		int d=0;//종료
		int e;
		int f;
		Scanner sc =new Scanner(System.in);
		do {
			System.out.println("-----------------");
			System.out.println("1.예금| 2.출금| 3.잔고| 4.종료");
			System.out.println("-----------------");
			System.out.print("선택> ");
			e=sc.nextInt();
			if(e==1) {
				System.out.print("예금 액>");
				f=sc.nextInt();
				c+=f;
			}else if(e==2) {
				System.out.print("출금 액>");
				f=sc.nextInt();
				
				if(f>c) {
					System.out.print("금액이 부족합니다.");
				}else {c-=f;}
			}else if(e==3) {
				System.out.print("잔고: "+c+"원");
			}else if(e>4) {
				System.out.print("오류가발생했습니다. 다시시도해주세요");
			}
		}while(e!=4);
		System.out.println("이용해주셔서감사합니다.");

	}

}

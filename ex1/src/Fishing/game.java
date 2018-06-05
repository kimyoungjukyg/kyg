package Fishing;


import java.util.Scanner;

public class game extends login{
	Scanner sc=new Scanner(System.in);
	
	
	
	void gamem() {

		System.out.println(getK());
		
		System.out.println("      FishingGame");
		System.out.println("=====================");
		System.out.println("1.게임시작 2.상점 3.수족관 4.종료");
		System.out.print(">>");
		
		int num2=sc.nextInt();
		if(num2==1) {
			System.out.println("게임을 시작합니다.");
			
		}else if(num2==2) {
			System.out.println("상점으로 이동합니다.");
			shop.enterShop();
		}else if(num2==3) {
		System.out.println(lo[getK()].necname+"님의 수조관으로 이동합니다.");
		System.out.println();
		System.out.println(lo[getK()].necname+"님의 수조관");
		System.out.println("=====================");
		fishcase.fishroom();
		
		}else if(num2==4) {
			
			System.out.println(lo[getK()].necname+"님이 낚시터를 떠났습니다.");
			
		}else {
			System.out.println("잘못된 키입니다.");
			gamem();
		}
	}}

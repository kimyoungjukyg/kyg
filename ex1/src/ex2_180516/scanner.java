package ex2_180516;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String name;
		String sd;
	 int year;//정수대입이라 int변수대입
		double hd;//실수대입이라 double변수대입
		
		System.out.println("이름,도시 ,나이, 체중을 빈칸에 분리입력하시오");
		name=sc.next();//문자열
		sd=sc.next();
		year=sc.nextInt();//정수
		hd=sc.nextDouble();//실수
		System.out.println("당신의 이름은"+name+"입니다");
		System.out.println("당신의 도시는"+sd+"입니다");
		System.out.println("당신의 나이는"+year+"입니다");
		System.out.println("당신의 체중은"+hd+"입니다");
sc.close();//종료
	}

}

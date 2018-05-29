package ex8_180525;

import java.util.Scanner;

public class ch6_23_absex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch6_23_abs abs=new ch6_23_abs();
		Scanner sc=new Scanner(System.in);
		int i;
		while(true) {
		abs.op();
		i=sc.nextInt();
		if(i==1) {
			System.out.println("두 점을(x,y)순으로 입력해주세요.");
			System.out.print("첫번쨰 x좌표");
			abs.x=sc.nextInt();
			System.out.print("첫번쨰 y좌표");
			abs.y=sc.nextInt();
			System.out.print("두번쨰 x좌표");
			abs.x2=sc.nextInt();
			System.out.print("두번쨰 y좌표");
			abs.y2=sc.nextInt();
			abs.km();
			System.out.println("----------------------------");
			
			
		}
		if(i==2) {
			System.out.println("정수를 입력하세요");
			int m=sc.nextInt();
			abs.las(m);
			System.out.println("----------------------------");
		}}
		

	}

}

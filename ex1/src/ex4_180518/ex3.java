package ex4_180518;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		int x=0;
		System.out.println("2x+4y=10의 해를구하시오");
		for(int y=0; 4*y<=10 ; y++) {
			x=(10-(4*y))/2;
			System.out.print("x값:"+x+" ");
			System.out.println("y값:"+y);
		}

	}

}

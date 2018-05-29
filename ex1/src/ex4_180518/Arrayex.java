package ex4_180518;

import java.util.Scanner;

public class Arrayex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("값 3개를 입력하세요");
int[] arr1=new int[3];
int sum=0;
int length=arr1.length;

Scanner sc=new Scanner(System.in);
arr1[0]=sc.nextInt();
arr1[1]=sc.nextInt();
arr1[2]=sc.nextInt();
for(int i=0; arr1.length>i; i++) {
	
	sum=sum+arr1[i];
}

double avg=sum/arr1.length;
System.out.println("합은 "+sum+" 평균 "+avg);
	}

}

package ex5_180521;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int b=0;
		int num=0;
		int a1[]=new int[num];
		int sum=0;
		int count=0;
		int max=0;
		double avg=0;
		do 
		{System.out.println("---------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("---------------------------------------------");
		System.out.print("선택>");
		b=sc.nextInt();
		
		if(b==1) {
				System.out.print("학생수> ");
				num=sc.nextInt();
				a1=new int[num];
				
			}
		if(b==2) {
				for(int i=0;i<a1.length;i++) {
				System.out.print((i+1)+"번 쨰 학생 점수 : ");
				a1[i]=sc.nextInt();
				sum+=a1[i];
				count++;
				if(a1[0]<a1[i]) {
					max=a1[i];
				}else {
					max=a1[0];
				}
					}}
		if(b==3) {
				for(int k=0;k<a1.length;k++) {	
				System.out.println((k+1)+"번 쨰 학생 점수 : "+a1[k]);}
			}
		if(b==4) {
			avg=sum/count;
			System.out.println("최고점수: "+max);
			System.out.println("평균점수: "+avg);
		}
		}
		
		while(b!=5);{
		System.out.println("종료합니다");	}}}
//while(true)를이용해서 무한반복해도됨
		
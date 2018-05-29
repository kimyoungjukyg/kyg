package ex5_180521;

import java.util.Scanner;

public class Arrayexercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words= {
				{"chair","의자"},
				{"desk","책상"},
				{"water","물"},
				{"monitor","모니터"},
				{"mouse","마우스"}};
		String a;
		int count=0;
		int count1=0;
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<words.length;i++) {
		System.out.println("문제 "+ (i+1) +"."+words[i][0]+"의 뜻은 무엇인가요");
		a=sc.nextLine();
			
		if(a.equals(words[i][1])) {
			
				System.out.println("맞았습니다");
				count++;
			}else {
				
				System.out.println("틀렸습니다.");
				count1++;
		}
		
	}	
	System.out.println("맞은 개수:"+count);
	System.out.println("틀린 개수:"+count1);	
		}

	}


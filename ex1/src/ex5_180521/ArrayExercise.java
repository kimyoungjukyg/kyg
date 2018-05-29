package ex5_180521;

import java.util.Scanner;

public class ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1=new int[5];
		int temp=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요");
		arr1[0]=scanner.nextInt();
		arr1[1]=scanner.nextInt();
		arr1[2]=scanner.nextInt();
		arr1[3]=scanner.nextInt();
		arr1[4]=scanner.nextInt();
		for(int i=0;i<arr1.length;i++) {
			
			for(int k=0;k<arr1.length;k++) {
				if(arr1[0]<=arr1[k]) {
					temp=arr1[0];
					arr1[0]=arr1[k];
					arr1[k]=temp;
				}
					for(int t=1; t<arr1.length; t++) {
						if(arr1[1]<=arr1[t]) {
							temp=arr1[1];
							arr1[1]=arr1[t];
							arr1[t]=temp;
						}
						for(int r=2;r<arr1.length;r++) {
							if(arr1[2]<=arr1[r]) {
								temp=arr1[2];
								arr1[2]=arr1[r];
								arr1[r]=temp;
							}
							for(int q=3;q<arr1.length;q++) {
								if(arr1[3]<=arr1[q]) {
									temp=arr1[3];
									arr1[3]=arr1[q];
									arr1[q]=temp;
								}
								for(int w=4;w<arr1.length;w++) {
									if(arr1[4]<=arr1[w]) {
										temp=arr1[4];
										arr1[4]=arr1[w];
										arr1[w]=temp;
									}
				
					}}}}}
			System.out.print( arr1[i]+".");
			}	
				
		
	
	}}
	
		
	



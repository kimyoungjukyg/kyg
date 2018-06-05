package ex12_180531;

import java.util.Arrays;

public class ch11_04_ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] score= {100,80,90};*/
		String[] score= {"가나다","하하하","롸롸라"};
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		//오름차순
		Arrays.sort(score);
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);}
		//내림차순 Arrays.sort(score,Collections.reverseOrder());
	}

}

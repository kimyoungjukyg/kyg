package ex5_180521;

public class Advancedfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 향상된 for문 (for-each)
 */
		int[] scores= {95,85,90,66,88};
		int sum=0;
		
		for(int score:scores) {
			sum=sum+score;
			System.out.println(score);
		}
	System.out.println("점수 총합:"+sum);}

}

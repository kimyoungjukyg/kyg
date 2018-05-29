package ex5_180521;

public class Arrayexercise3 {

	public static void main(String[] args) {
		double sum=0;
		double avg=0;
		int count=0;
		// TODO Auto-generated method stub
		double score[][]= {{3.3,3.4},{3.5,3.8},{4.2,4.3},{3.9,4.0}};
		for(int i=0;i<score.length;i++) {
			for(int k=0;k<score[i].length;k++) {
				sum+=score[i][k];
				count++;
			}
			
			avg=sum/count;
		}System.out.println(avg);
		
		

	}

}

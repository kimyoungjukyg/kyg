package ex4_180518;
//배열선언
public class ArratCreateByValueList {

	public static void main(String[] args) {
		//배열선언
		//int[] scores[];[]범위0으로시작
		int[] scores= {83,90,87};//배역길이3 인덱스길이2=>[3]=0.1.2=>3개
		//배역값출력
		System.out.println("scores[0]: "+scores[0]);
		System.out.println("scores[1]: "+scores[1]);
		System.out.println("scores[2]: "+scores[2]);
		
		//배열 요소들의 합 구하기
		int sum=0;
		for(int i=0; i<=2;i++) {
			sum=sum+scores[0];
			sum=sum+scores[1];
			sum=sum+scores[2];
		}
		//배열길이
				int length=scores.length;
				System.out.println("배열길이:"+length);
				//평균구할떄
				double avg=sum/scores.length;
				System.out.println("평균"+avg);
				//다차원 배열일경우 위치정확히 ex)score[2][2];
	}

}

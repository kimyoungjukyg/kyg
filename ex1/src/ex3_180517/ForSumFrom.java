package ex3_180517;

public class ForSumFrom {

	public static void main(String[] args) {
		int sum=0;//합계를 담을 변수
		//int sum과같이 그냥선언만하게되면 오류검출
		//선언만하면 불특정한 값이들어감
		for(int i=1; i<=100; i++) {
//1+2+3+4+....+100
			//1+2=3+3=6+4=10+5=15....
			sum=sum+i;//==(sum+=i;)
			
	}
		System.out.println(sum);
}
}
package ex3_180517;

public class While {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=100) {
			sum+=i; 
			i++;
			//while문의 조건식을 만족하는 동안 실행됨
		}
		
		System.out.println("1부터 100까지의 합:"+sum);
	}

}

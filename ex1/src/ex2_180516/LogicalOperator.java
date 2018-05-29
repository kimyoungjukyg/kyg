package ex2_180516;

public class LogicalOperator {
//and연산자(&&)=둘다참일떄 참
	//or연산자(||)=하나라도참일떄 참
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode='A';
		
		if((charCode>=65)&&(charCode<=90)) {
			System.out.println("대문자이군요");
		}
		if((charCode>=97)&&(charCode<=122)) {
			System.out.println("소문자이군요");
			//false라서 실행안됨
		}
		if(!(charCode<48)&& !(charCode>57)) {
			System.out.println("0~9숫자 이군요");
			//false라서 실행안됨
		}
		int value=6;
		if((value%2==0)||(value%3==0)) {
		System.out.println("2또는3의 배수이군요");

	}
	}
}

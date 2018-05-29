package ex2_180516;

public class casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue=44032;
		//char charValue=(char)intValue;
		char charValue=(char)intValue;
		//int변수를 char변수로 강제변환=>유니코드에맞는 글자로바낌
		System.out.println(charValue);
		
		long longValue=500;
		intValue=(int)longValue;
		//long변수를int변수로
		System.out.println(intValue);
		
		double doubleValue=3.14;
		intValue=(int)doubleValue;
		//double변수를int변수로바꿈(실수=>정수)소수점자리사라짐
		System.out.println(intValue);

	}

}

package ex2_180516;

public class operationprimotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1=10;
		byte byteValue2=20;
		//byte byteValue3=(byte) (byteValue1+byteValue2);//컴파일오류
		//연산시에는 기본적으로int타입이 됨
		int intValue1=byteValue1+byteValue2;
		//int변수가 byte보다더큰변수임으로 자동변환
		System.out.println(intValue1);
		
		char charValue1='A';
		char charValue2=1;
		char charValue3=(char)(charValue1+charValue2);
		//위의 charVale3가 경고가난오는이유는 선언하고도 사용하지않았기떄문
		//char변수를 더해줄떄에는 숫자로변환한뒤에 더해주어야하기떄문에 char로
		//출력하기위해서는 int변수로바낀것을 강제변환해야한다.
		//char변수+char변수=>연산사용으로인해 int변수로변환
		int intValue2=charValue1+charValue2;
		System.out.println("유니코드="+intValue2);
		System.out.println("출력문자="+(char)intValue2);
		
		int intValue3=10;
		int intValue4=intValue3/4;
		//int변수는 정수이므로 소수점출력 x
		System.out.println(intValue4);
		
		int intValue5=10;
		//int intValue6=10/4.0;//컴파일에러
		double doubleValue=intValue5/4.0;
		//4.0으로나누어(실수값으로나누어) 소수점이 표현되게되어 int로는 표현할수없다.
		//연산시에기본적으로 정수대정수이지만 한쪽이 실수이면 더큰영역으로 맞추어서 연산한다.
		//double doubleValue=intValue5/4.;=>이 값은2로나옴
		System.out.println(doubleValue);
		
		
	}

}

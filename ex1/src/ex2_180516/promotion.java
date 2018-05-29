package ex2_180516;

public class promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte byteValue=10;
		//byte변수에 byteValue선언하며 초기값10줌
int intValue=byteValue;
//int변수에 intValue선언하며 초기값byteValue줌
//기존의 byte타입의 변수가 int타입으로 자동타입변환
System.out.println(intValue);

char charValue='가';
intValue=charValue;
//int변수는 문자를 나타낼수없어서 '가'의 유니코드가 들어간다
System.out.println("가의 유니코드="+intValue);
	
intValue=500;
long longValue=intValue;
//기존의int변수가 long변수로 자동변환

System.out.println(longValue);

intValue=200;
double doubleValue=intValue;
//기존의 int변수가 double변수로 자동변환(정수>실수)소수점생김
System.out.println(doubleValue);

	}

}

package ex2_180516;

public class ArithmeticOprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=5;
		int v2=2;
		
		int result1=v1+v2;
		System.out.println("result1="+result1);
		
		int result2=v1-v2;
		System.out.println("result2="+result2);
		
		int result3=v1*v2;
		System.out.println("result3="+result3);
		
		int result4=v1/v2;//정수 나누기로 소수점은 버림
		System.out.println("result4="+result4);
		
		int result5=v1%v2;//나머지구하기
		System.out.println("result5="+result5);
		
		double result6=(double)v1/v2;//실수형이되어5.0/2.0이됨
		System.out.println("result6="+result6);
		

	}

}

package ex2_180516;

public class signoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-100;
		int result1=+x;
		int result2=-x;
		System.out.println("result1="+result1);
		//+(-100)
		System.out.println("result2="+result2);
		//-(-100)
		short s=100;
		//short result3=-s//컴파일에러//연산을한거라int값이됨
		int result3=-5;
		
		System.out.println("result3="+result3);
	}

}

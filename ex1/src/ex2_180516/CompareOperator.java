package ex2_180516;
//비교연산자 p88
public class CompareOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=10;
		boolean result1=(num1==num2);//같아서 true
		boolean result2=(num1!=num2);//다르지않으므로 false
		boolean result3=(num1<=num2);
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		System.out.println("result3="+result3);
		char char1='A';
		char char2='B';
		boolean result4=(char1<char2);
		//아스키코드로 A는65,B는66이되기떄문에 비교가능
		System.out.println("result4="+result4);
		
		
	}

}

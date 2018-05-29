package ex2_180516;
//A+=B=>A=A+B

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result =0;
		result += 10;
		System.out.println("result="+result);//10
		
		result -= 5;
		System.out.println("result="+result);//5
		
		
		result *= 3;
		System.out.println("result="+result);//15
		
		result /= 5;
		System.out.println("result="+result);//3
		
		result %= 3;
		System.out.println("result="+result);//0
		

	}

}

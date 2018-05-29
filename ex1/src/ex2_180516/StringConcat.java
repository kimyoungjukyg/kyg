package ex2_180516;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 문자열을 저장할수있는 타입
		String str1="JDK"+8.0;//JDK8.0
		String str2=str1+"특징";
		System.out.println(str2);
		
		String str3="JDK"+3+3.0;
		String str4=3+3.0+"JDK";
		//문자열이선언되기전에는 그냥연산자로 인식
		System.out.println(str3);
		System.out.println(str4);
		
		

	}

}

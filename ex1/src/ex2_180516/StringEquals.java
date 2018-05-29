package ex2_180516;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strVar1="이름";
		String strVar2="이름";
		//new연산자 :새로운 객체를 생성할때 사용하는 연산자
		String strVar3=new String("이름");
		System.out.println(strVar1==strVar2);
		//true
		System.out.println(strVar1==strVar3);
		//동등비교시에 다른것으로 인식
		//false
		System.out.println();
		//.equals
		System.out.println(strVar1.equals("이름"));
		System.out.println(strVar1.equals(strVar3));
		
		

	}

}

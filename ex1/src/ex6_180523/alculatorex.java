package ex6_180523;

public class alculatorex {

	public static void main(String[] args) {
		//calculator객체생성
		//power On메소드 호출
		//plus메소드 호출(매개값은 알아서)및 호출결과출력
		//divide메소드 호출 및 호출결과 출력
		//power off 메소드 호출
		calculator ca=new calculator();
		ca.PowerOn();
		System.out.println("plus값: "+ca.plus(15,10));
		System.out.println("divide값: "+ca.divide(15,10));
		ca.powerOff();
		
		
		
		
		


	}

}

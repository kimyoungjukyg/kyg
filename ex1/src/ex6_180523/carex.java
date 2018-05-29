package ex6_180523;
//carex클래스
public class carex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//car클래스선언
		//car클래스에서 선언한 필드값 출력;
		car ca=new car();//car객체생성
		System.out.println(ca.color);//car클래스의 color 필드 값 출력
		System.out.println(ca.company);
		System.out.println(ca.model);
		System.out.println(ca.speed);
		System.out.println(ca.maxSpeed);
		//필드값변경
	int number=10;
	number=30;
	ca.speed=60;//정확하게지칭
	System.out.println(ca.speed);
	}

}

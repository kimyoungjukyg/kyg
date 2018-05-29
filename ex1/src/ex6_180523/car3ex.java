package ex6_180523;

public class car3ex {

	public static void main(String[] args) {
		// 1.기본생성자를 이용한 객체 생성하여 필드값출력
		car3 ca3=new car3();
		System.out.print(ca3.company);
		System.out.print(ca3.model);
		System.out.print(ca3.color);
		System.out.println(ca3.maxSpeed);
		// 2.model매개변수갖는 생성자를 이용한 객체 생성하여 필드값출력
		car3 ca31=new car3("그랜저");
		System.out.println(ca31.company+ca31.model+ca31.color+ca31.maxSpeed);
		
		// 3.model,color매개변수갖는 생성자를 이용한 객체 생성하여 필드값출력
		car3 ca32=new car3("그랜저2","회색");
		System.out.print(ca32.company);
		System.out.print(ca32.model);
		System.out.print(ca32.color);
		System.out.println(ca32.maxSpeed);
		// 4.model,color,maxSpeeed매개변수갖는 생성자를 이용한 객체 생성하여 필드값출력
		car3 ca33=new car3("그랜저3","갈색",200);
		System.out.print(ca33.company);
		System.out.print(ca33.model);
		System.out.print(ca33.color);
		System.out.println(ca33.maxSpeed);
		

	}

}

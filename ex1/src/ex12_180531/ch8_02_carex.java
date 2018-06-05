package ex12_180531;

public class ch8_02_carex {

	public static void main(String[] args) {
		ch8_02_car car=new ch8_02_car();
		car.run();
		System.out.println("------------------");
		System.out.println("변수에 다른 객체대입");
		car.frontlefttire=new ch8_02_kmho();
		car.run();

	}

}

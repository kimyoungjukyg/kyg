package ex9_180528;

public class ch7_03_computerex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=10;
		//부모클래스에서 메소드 호출
		ch7_03_calculator calculator=new ch7_03_calculator();
		System.out.println("부모클래스 메소드 호출: "+calculator.areacircle(r));
		//자식클래스에서 재정의된 메소드 호출
		ch7_03_computer computer=new ch7_03_computer();
		System.out.println("자식클래스 메소드 호출 "+computer.areacircle(r));

	}

}

package ex9_180528;

public class ch7_04_supersoex {
	public static void main(String[] args) {
		ch7_04_superso sa=new ch7_04_superso();
		sa.takeoff();
		sa.fly();
		sa.flyMode=ch7_04_superso.SUPERSONIC;
		sa.fly();
		sa.flyMode=ch7_04_superso.NORMAL;
		sa.fly();
		sa.land();
	}
}

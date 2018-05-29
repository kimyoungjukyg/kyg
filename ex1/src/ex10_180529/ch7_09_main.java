package ex10_180529;

import ex6_180523.car;

public class ch7_09_main {
	public static void main(String[] args) {
		ch7_09_sedan sedan=new ch7_09_sedan();
		ch7_09_truck truck=new ch7_09_truck();
		
		sedan.speed=200;
		truck.speed=100;
		sedan.chair=5;
		truck.truck=5;
		sedan.color="빨강";
		truck.color="검정";
		System.out.println(sedan.color+"승용차의 속도는 "+sedan.speed+"이고 좌석수는 "+sedan.chair+"입니다.");
		System.out.println(truck.color+"트럭의 속도는 "+truck.speed+"이고 적재량은 "+truck.truck+"톤입니다.");
		
		
	}
}

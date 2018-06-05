package ex12_180531;

public class ch8_04_tank implements ch8_04_cannon,ch8_04_car{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("탱크가 대포를 발사합니다.");
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("탱크가 앞으로 전진합니다.");
	}

}

package ex12_180531;

public class ch8_00_smartphone extends ch8_00_pda implements ch8_00_mp3,ch8_00_mobliephone{
	


	@Override
	public void callon() {
		// TODO Auto-generated method stub
		System.out.println("전화를 검니다.");
	}

	@Override
	public void calloff() {
		// TODO Auto-generated method stub
		System.out.println("전화를 받습니다.");
	}

	@Override
	public void sendrite() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("음악을끔니다.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("음악을킵니다.");
	}

	@Override
	public void rite() {
		// TODO Auto-generated method stub
		System.out.println("문자를 받습니다.");
	}
	
}

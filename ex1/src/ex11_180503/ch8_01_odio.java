package ex11_180503;

public class ch8_01_odio implements ch8_01_remotecontrol{
	//필드선언
	private int volume;
	private boolean mute;

	
	@Override
	public void turnon() {
		System.out.println("오디오를 켭다.");
	}		

	@Override
	public void turnoff() {
		System.out.println("오디오를 끕니다.");
		
		
	}

	@Override
	public void setvolume(int volume) {
		if(volume>ch8_01_remotecontrol.MAX_VOLUME) {
			this.volume=ch8_01_remotecontrol.MAX_VOLUME;
		}else if(volume<ch8_01_remotecontrol.MIN_VOLUME) {
			this.volume=ch8_01_remotecontrol.MIN_VOLUME;
		}else {this.volume=volume;
		}
		
		System.out.println("현재 오디오볼륨: "+volume);
		
		
	}
	
	@Override
	//인터페이스에서 정의한 디폴트 메소드를 재정의할떄
	//접근제한 변경(default>public)
	public void setmute(boolean mute) {
		if(mute) {
			System.out.println("audio 무음처리합니다.");
		}else {
			System.out.println("audio 무음 해제합니다.");
		}
	}
	
	
	
	
	
}

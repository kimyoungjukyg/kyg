package ex11_180503;
//인터페이스 remotecontrol의 구현클래스
public class ch8_01_television implements ch8_01_remotecontrol{
	//필드선언
	private int volume;
	
	
	
	@Override
	public void turnon() {
		System.out.println("tv를 켭니다.");
	}		

	@Override
	public void turnoff() {
		System.out.println("tv를 끕니다.");
		
		
	}

	@Override
	public void setvolume(int volume) {
		if(volume>ch8_01_remotecontrol.MAX_VOLUME) {
			this.volume=ch8_01_remotecontrol.MAX_VOLUME;
		}else if(volume<ch8_01_remotecontrol.MIN_VOLUME) {
			this.volume=ch8_01_remotecontrol.MIN_VOLUME;
		}else {this.volume=volume;
		}
		
		System.out.println("현재 tv볼륨: "+volume);
		
		
	}
	
	
	
	
	
	

}

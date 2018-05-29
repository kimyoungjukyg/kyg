package ex7_180524;
//getter,setter 메소드사용예
public class ch6_17_car {
	//필드선언
	private int speed;
	private boolean stop;
	
	
	//간단한방법:오른쪽마우스=>source=>중간에있는 거찾아들어가기
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
	/*//메소드선언
	//speed 필드에 대한getter메소드 선언
	public int getspeed() {
		return speed;
	}
	//speed 필드에 대한 setter 메소드 선언
	public void setspeed(int speed) {
		if(speed<0) {
			this.speed=0;
			return;
		}else {
			this.speed=speed;
		}
	}
	//stop 필드에 대한 getter 메소드 선언
	public boolean isstop() {
		return stop;
	}
	//stop 필드에 대한setter 메소드 선언
	public void setstop(boolean stop) {
		this.stop=stop;
		this.speed=0;
	}*/
}

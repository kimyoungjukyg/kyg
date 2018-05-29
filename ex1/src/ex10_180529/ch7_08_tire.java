package ex10_180529;

public class ch7_08_tire {
	public int maxrotation;//최대회전수 (타이어수명)
	public int accumulatedrotation;//누적회전수
	public String location;//타이어위치
	
	//생성자
	public ch7_08_tire(String location,int maxrotation) {
		this.location=location;
		this.maxrotation=maxrotation;
	}
	//메소드
	public boolean roll() {
		++accumulatedrotation;//누적회전수1증가
		if(accumulatedrotation<maxrotation) {
			System.out.println(location+"tire 수명"+(maxrotation-accumulatedrotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"tire평크 ***");
			return false;
		}
	}
	
	
	
}

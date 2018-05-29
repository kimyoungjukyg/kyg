package ex10_180529;

public class ch7_08_kumhotire extends ch7_08_tire{
	//필드
	//생성자
	public ch7_08_kumhotire(String location,int maxrotation) {
		super(location,maxrotation);//부모값가져오기
	}
	//메소드
	@Override
	public boolean roll() {
		++accumulatedrotation;
	if(accumulatedrotation<maxrotation) {
		System.out.println(location+"kumhotire 수명"+(maxrotation-accumulatedrotation)+"회");
		return true;
	}else {
		System.out.println("***"+location+"kumhotire평크 ***");
		return false;
	}
		
	}
	
	
}

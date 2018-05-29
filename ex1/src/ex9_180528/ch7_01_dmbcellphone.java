package ex9_180528;
//cellPhone의 자식 클래스
//상속방법: 자식클래스명 extends 부모클래스명
public class ch7_01_dmbcellphone extends ch7_01_cellphone{
	//필드선언
	int channel;
	
	//생성자 선언
	ch7_01_dmbcellphone(String model,String color,int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	//메소드 선언
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 Dmb방송수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMb방송수신을 멈춥니다.");
	}
	
	
	
}

package ex9_180528;

public class ch7_01_dmbcellphoneex{

	public static void main(String[] args) {
		//DmbcellPhone에대한 객체생성
		ch7_01_dmbcellphone dmb=new ch7_01_dmbcellphone("모델","금색",123123);
		//meoDel,color필드는 부모님의 필드지만 상속을 받았기떄문에
		//자식클래스 에서 접근할수있다.
		System.out.println(dmb.model);
		System.out.println(dmb.color);
		System.out.println(dmb.channel);
		
		dmb.turnOnDmb();
		dmb.changeChannelDmb(123123);
		dmb.turnOffDmb();
		dmb.PowerOn();
		dmb.PowerOff();
		dmb.bell();
		dmb.sendVoice("전화");
		dmb.receiveVoice("전화");
		dmb.hangUp();
		
	}

}

package ex1;

public class exfloatdouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//실수형 변수를 선언하는 타입 double(8byte),float(4byte)
		//자바는 기본실수값을 double타입으로 인지하기떄문에 float타입의 변수에
		//실수를담기위해서는 끝에F를 붙여야함
		double var1 =3.14;
		//int var2=3.14;
		float var3=3.14F;
		
	
		double var7=3e6;//3*10^6
		float var8=3e6F;//3*10^-6
		double var9 =2e-3;//2*10^-3
		System.out.println("var1 "+"더연결하면 "+var1);
		System.out.println("var3 "+var3);
		System.out.println("var7 "+var7);
		System.out.println("var8 "+var8);
		System.out.println("var9 "+var9);
	}

}

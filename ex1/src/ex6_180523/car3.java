package ex6_180523;
//생성자(constructor) overloading
public class car3 {
	//field선언
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//여러 종류의 생성자 선언
	/*1.기본생성자
	 * 2.model을 매개변수로 하는생성자
	 * 3.model,color를 매개변수로하는 생성자
	 * 4.model,color,maxSpeed를 매개변수로하는 생성자
	 */
	car3(){}
	/*car3(String m){
	model=m;
	}*/
	car3(String modle,String color){//가능은하지만 가독성이안좋와서 this.을붙임
		model=modle;
		this.color=color;
	}
	car3(String model,String color,int maxSpeed){
		this.model=model;this.color=color;this.maxSpeed=maxSpeed;
	}
	car3(String model){
		this(model,"은색",300);
		//현재 클래스에 있는 (String String int)형태의 생성자를 호출하여 매개값을 넘길떄 사용하는 this기법
	}
	
	
	
	
	
}

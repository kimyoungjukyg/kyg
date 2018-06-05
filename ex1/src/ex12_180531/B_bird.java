package ex12_180531;

public class B_bird extends B_countable{

	B_bird(String name,int num) {
		super(name,num);
		
	}
	public void fly(){
		System.out.println(num+"마리"+name+"가 날아간다.");}
	
	
	@Override
	public void count() {
		System.out.println(name+"이 "+num+"마리있다.");
	}

}

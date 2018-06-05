package ex12_180531;

public class A_bird implements A_countable{
String name;
A_bird(String name){
	this.name=name;
};
void fly() {
	System.out.println("2마리"+name+"날아간다.");
};	
	
	@Override
	public void count() {
		System.out.println(name+"2마리 있다.");
	
		
	}

}

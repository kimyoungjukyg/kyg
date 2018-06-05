package ex12_180531;

public abstract class B_countable {
	protected String name;
	protected int num;
	B_countable(String name,int num){
		this.name=name;
		this.num=num;
	}
	abstract void count();
}

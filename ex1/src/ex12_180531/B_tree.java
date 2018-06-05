package ex12_180531;

public class B_tree extends B_countable{

	B_tree(String name,int num) {
		super(name,num);
	}
	 void ripen() {
		System.out.println(num+"그루"+name+"가 열매를 맺는다.");
	 }
	@Override
	void count() {
		System.out.println(name+"가 "+num+"그루있다.");
	}

}

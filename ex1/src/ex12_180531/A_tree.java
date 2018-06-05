package ex12_180531;

public class A_tree implements A_countable{
	String name;
	A_tree(String name){
		this.name=name;
	};
	public void ripen() {
		System.out.println(name+"의 열매가 잘 익었다.");
	}	
		
		@Override
		public void count() {
			System.out.println(name+"가 5그루 있다.");
			
		}


}

package ex11_180503;

public class q_employee {
	public String name;
	public double price;
	public String position;
	
	
	public q_employee(String name,double price,String position) {
		this.name=name;
		this.price=price;
		this.position=position;
	}
	public double rise() {
		price=price*1.1;
		return price;
	}
	
		
	
}

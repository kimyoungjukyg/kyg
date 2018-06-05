package ex11_180503;

public class q_executive extends q_manager{
	public int option;
	public q_executive(String name,double price,String position,int add,int option) {
		super(name, price, position, add);
		this.option=option;
	}
	
	
	
	@Override
	public double rise() {
		price=price*1.3;
		return price;
	}
}

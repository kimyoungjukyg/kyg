package ex11_180503;

public class q_manager extends q_employee{
	public int add;
	public q_manager(String name,double price,String position,int add){
		super(name,price,position);
		this.add=add;
	}
	public double adding() {
		return price+add;
	}
	
	@Override
	public double rise() {
		price=price*1.2;;
		return price;
	}
}

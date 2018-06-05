package ex14_180604;

public class cellPhone extends Product{

	String carrier;
	
	public cellPhone(String pName,int price,String carrier) {
		this.pName=pName;
		this.price=price;
		this.carrier=carrier;
	}
	
	
	@Override
	public void printExtra() {
		System.out.println("통신사: "+carrier);
	}

}

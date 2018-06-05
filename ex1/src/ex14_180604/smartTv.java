package ex14_180604;

public class smartTv extends Product{
String resolution;
	
public smartTv(String pName,int price,String resolution) {
	this.pName=pName;
	this.price=price;
	this.resolution=resolution;
}
	

	@Override
	public void printExtra() {
System.out.println("해상도: "+resolution);		
	}

}

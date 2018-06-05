package ex14_180604;

//쇼핑몰을 실행하기 위한 메인 메소드 클래스
public class ShopLauncher {

	public static void main(String[] args) {
		Ishop shop=new Myshop();
		shop.setTitle("Myshop");
		shop.genUser();
		shop.genProduct();
		shop.start();
		
		
		
		
	}

}

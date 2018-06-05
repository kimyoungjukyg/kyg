package Fishing;

public class wwwww {
	 
	int i;
	 void sea() {
		 
		fish[] sea=new fish[10];
		String name = null;
		int length=0;
		int price=0;
		
		for(int i=1;i<sea.length;i++) {
			if(i==1) { name="아귀" ;length=(int)((Math.random()*30)+1);price=3000; 
			}
			else if(i==2) { name="황물퉁돔" ; length=(int)((Math.random()*30)+1); price=7000;}
			else if(i==3) {name="무지개쥐돔" ; length=(int)((Math.random()*30)+1); price=15000;}
			else if(i==4) { name="고래상어" ; length=(int)((Math.random()*30)+1); price=2000;}
			else if(i==5) { name="정어리" ; length=(int)((Math.random()*30)+1); price=8000;}
			else if(i==6) { name="곰치" ; length=(int)((Math.random()*30)+1); price=1500;}
			else if(i==7) { name="넙치" ; length=(int)((Math.random()*30)+1); price=3500;}
			else if(i==8) { name="멸치" ; length=(int)((Math.random()*30)+1); price=800;}
			else if(i==9) { name="쥐치" ; length=(int)((Math.random()*30)+1); price=1000;}
			fish fish=new fish(name, length, price);
			sea[i]=fish;
				System.out.println(sea[i].name+" " + sea[i].length+"cm"+" "+sea[i].price+"원");
		
		
		
		
		
}}}

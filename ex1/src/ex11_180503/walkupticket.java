package ex11_180503;


public class walkupticket extends ticket{
public walkupticket(int cost, String on) {
		super();}
advancedticket ad=new advancedticket( cost, on);

public String cash;
void run() {		
if(ad.day<5){
	if(cash.equals("사용")) {
		on="일반";
		cost=(cost*105)/100;
	}
}
	
}
		
}

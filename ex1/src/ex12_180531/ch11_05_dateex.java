package ex12_180531;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ch11_05_dateex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now =new Date();
		//문자열변경
		String strNow=now.toString();
		System.out.println(now);
		System.out.println(strNow);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년mm월dd일hh시mm분");
		String strNow2=sdf.format(now);
		System.out.println(strNow2);
		
	}

}

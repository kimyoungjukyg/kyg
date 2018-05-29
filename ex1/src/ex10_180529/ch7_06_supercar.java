package ex10_180529;

public class ch7_06_supercar extends ch7_06_car{
//speedup재정의
@Override
public void speedup() {
	speed+=10;
}
//stop메소드 재정의(final)
/*@Override
public void stop() {
	//안됨
	System.out.println("스포츠카를멈춤");
	speed=0;
}*/

}

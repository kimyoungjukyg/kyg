package ex2_180516;

public class CompareOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v2=1;
		double v3=1.0;
		System.out.println(v2==v3);
		//true v2가double타입으로 자동변형된후 비교연산수행
		
		double v4=0.1;
		float v5=0.1f;
		System.out.println(v4==v5);
		//false 0.1f근사치 실제값은0.10000002232423
		System.out.println((float)v4==v5);
		System.out.println((int)(v4*10)==(int)(v5*10));
		//가로제거시 결과 달라짐

	}

}

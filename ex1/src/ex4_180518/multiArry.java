package ex4_180518;

public class multiArry {

	public static void main(String[] args) {
		//2차원 배열선언 배역크기 지정 2행3열
		int[][] mathScores=new int[2][3];
		//선언된 배열의 초기값 확인
		for(int i=0;i<mathScores.length;i++) {//2=행의 개수
			for(int k=0;k<mathScores[i].length;k++) {//3=열의개수
				System.out.println("mathScores["+i+"]["+k+"]="
				+mathScores[i][k]);
			}
			
		}
		System.out.println();
		
int[][] englishScores=new int[2][];
englishScores[0]=new int[2];//1행에2열배정
englishScores[1]=new int[3];//2행에3열배정
	
	
	
	int [][] javaScores= {{95,80},{92,96,80}};
	}

}

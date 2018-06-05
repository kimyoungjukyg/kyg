package ex13_180601;

import java.io.File;
import java.io.*;

//파일 입출력
public class fileclass {

	public static void main(String[] args) {
		//파일(텍스트파일)을 생성하고 내용을 쓰기
		//저장결로로 사용하기 위한 변수 선언
		String path="D:\\text0601\\textfile.txt";
		//파일객체생성
		File file=new File(path);
		try {
			//실질적인 쓰기역활
			FileWriter fw=new FileWriter(file);
		for(int i='A';i<='Z';i++) {
			fw.write(i);
		}
		fw.close();
		System.out.println("쓰기완료....");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}

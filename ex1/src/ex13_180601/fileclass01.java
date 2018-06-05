package ex13_180601;

import java.io.*;

public class fileclass01 {
	public static void main(String[] args) {
		//기존파일을 새로운 파일로 저장하기
		//기존 파일에 대한 객체생성
		File rfile=new File("D:\\text0601\\textfile.txt");
		//새롭게 만들 파잉에 대한 객체생성
		File wfile=new File("D:\\text0601\\textfile_new.txt");
		
		try {
			//기존파일을 읽어오기위한 reader객체생성
			BufferedReader reader=new BufferedReader(new FileReader(rfile));
			//읽어낸 내용을 쓰기위한 writer객체생성
			BufferedWriter writer=new BufferedWriter(new FileWriter(wfile));
		String s;
		//s에 저장된 내용 및 추가 문자열을 새로운파일인 wfile에 저장
		while((s=reader.readLine())!=null) {
			writer.write(s+"-새로 쓰여진 파일");
		}
		reader.close();
		writer.close();
		rfile.delete();//기존파일 삭제
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("새로쓰기완료");
		
		
	}
}

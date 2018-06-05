package ex13_180601;

import java.util.List;
import java.util.*;

public class ch15_02_vectorex {
//멀티스레더환경에서좋음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ch15_02_board> list=new Vector<ch15_02_board>();
		list.add(new ch15_02_board("제목1","글내용","사용자1"));
		list.add(new ch15_02_board("제목2","글내용","사용자2"));
		list.add(new ch15_02_board("제목3","글내용","사용자3"));
		list.add(new ch15_02_board("제목4","글내용","사용자4"));
		list.add(new ch15_02_board("제목5","글내용","사용자5"));
		
		for(int i=0;i<list.size();i++) {
 
			ch15_02_board board=list.get(i);
			//ch15_02_board board=new ch15_02_board("제목1","글내용","사용자1");
			System.out.println(board.subgject);
			System.out.println(board.content);
			System.out.println(board.writer);
			System.out.println();
		}
		
	}

}

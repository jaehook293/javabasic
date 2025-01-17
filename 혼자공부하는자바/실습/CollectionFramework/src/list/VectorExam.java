package list;

import java.util.*;

public class VectorExam {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		//board 객체를 저장
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		//2번 인덱스 객체 삭제 (뒤의 인덱스는 1씩 앞으로 당겨짐)
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "	" + board.content + "	" + board.writer);
		}
	
	}

}

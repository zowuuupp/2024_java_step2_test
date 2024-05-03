package chapter16.vector;

import java.util.List;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		
		List<Board> list = new Vector<>(); //����Ʈ�� ������ �θ�.
		
		//���� �߰�
		Board b = new Board("����1", "����1", "�۾���1");
		list.add(b);
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
		for(int i=0; i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		
		//���� ����
		System.out.println();
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		
		
	}

}

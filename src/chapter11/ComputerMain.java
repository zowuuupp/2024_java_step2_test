package chapter11;

public class ComputerMain {

	public static void main(String[] args) {
		
		/*
		DeskTop dt = new DeskTop();
		dt.disply();
		dt.typing();
		
		MyNoteBook mnb = new MyNoteBook();
		mnb.disply();
		mnb.typing();
		*/
		
		Computer c2=new DeskTop();
		c2.disply();
		c2.typing();
		
		//abstract 클래스는 객체를 만들 수 없다.
		//Notebook nb = new NoteBook();
		
		Computer c4=new MyNoteBook();
		c4.disply();
		c4.typing();
		
	}

}

package chapter11;

public class MyNoteBook extends NoteBook{
	
	//NoteBook에서 구현 안 된 typing()을 구현했으니 추상메소드라고 인지를 안 한다.
	@Override
	public void typing() {      
		System.out.println("MyNoteBook Typing()");
	}
	

}

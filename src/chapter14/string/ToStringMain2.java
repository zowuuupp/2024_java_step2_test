package chapter14.string;

class Book{
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return title+", "+author;
	}
	
}

public class ToStringMain2 {

	public static void main(String[] args) {
		
		Book book = new Book("자바2","솔데스크");
		System.out.println(book);
		System.out.println(book.toString());
		
		String str = new String("Oracle");
		System.out.println(str);
		
		
		
		
		
		
		
		
	}

}

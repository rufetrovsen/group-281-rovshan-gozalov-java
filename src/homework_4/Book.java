package homework_4;

public class Book {

	    String title;
	    String author;

	    void printInfo() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	    }

	    public static void main(String[] args) {
	        Book book = new Book();
	        book.title = "The Hobbit";
	        book.author = "J. R. R. Tolkien";

	        book.printInfo();
	    }
	}



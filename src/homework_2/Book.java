package homework_2;

public class Book {

	    String title;
	    String author;
	    int year;

	    public Book(String title, String author, int year) {
	        this.title = title;
	        this.author = author;
	        this.year = year;
	    }

	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	        this.year = 0;
	    }

	    public void printInfo() {
	        System.out.println(title);
	        System.out.println(author);
	        System.out.println(year);
	    }
	}



package Classwork_11;

public class Book {


	String title, author;
    int pages;
    static int totalBooks = 0;

    public Book(String title, String author, int pages) {
        this.title  = title;
        this.author = author;
        this.pages  = pages;
        totalBooks++;
    }

    public static int getTotalBooks() {
    return totalBooks;
    }

    public boolean isLong() { return pages > 300; }

    public static void main(String[] args) {
        Book b1 = new Book(" KNIGA MURADA", "ROVSHAN", 500);
        Book b2 = new Book("KNIGA UCITELA", "ROVSHAN", 20);
        new Book("KARTOSKA KABAB", "RUSLAM DAYI", 450);

        System.out.println("KNIJKI: " + Book.getTotalBooks());
        System.out.println(b1.isLong());
        System.out.println(b2.isLong());
    }
}

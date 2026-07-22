public class C3 {
    public static void main(String[] args) {
        Book b1 = new Book(101, "abcd", "abcd", 123);
        Book b2 = new Book(101, "abcD", "abcD", 142);
        Book b3 = new Book(101, "abcD", "abcD", 142);

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }

    static final class Book {
        final private int bookId;
        final private String title;
        final private String author;
        final private int price;

        Book(int bookId, String title, String author, int price) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void displayDetails() {
            System.out.println("ID: " + bookId);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
            System.out.println();
        }
    }
}
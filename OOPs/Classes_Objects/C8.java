package OOPs.Classes_Objects;

public class C8 {
    public static void main(String[] args) {
        Book b1 = new Book(1028, "Birth of The CITY", "Neharika");
        b1.printDetails();
    }
}

class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void printDetails() {
        System.out.println("Book Details\nID: "+bookId+"\nTitle: "+title+"\nAuthor: "+author);
    }
}
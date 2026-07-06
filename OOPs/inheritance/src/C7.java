package OOPs.inheritance.src;

public class C7 {
    public static void main(String[] args) {
        EBook7 eb1 = new EBook7("Santosh", "Manoj Kumar", "32 MB");
        eb1.display();
    }
}

class Book7 {
    String title;
    String author;

    Book7(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class EBook7 extends Book7 {
    String fileSize;

    EBook7(String title, String author, String fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    void display() {
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nFile Size: "+fileSize);
    }
}
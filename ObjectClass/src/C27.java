public class C27 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book b1 = new Book(101);

        Book b2 = (Book) b1.clone();

        Book b3 = b1;

        System.out.println("b1.id "+b1.id);
        System.out.println("b2.id "+b2.id);
        System.out.println(b3.id);
        System.out.print("b1.equals(b2) ");
        System.out.println(b1.equals(b2));
        System.out.println("b1 == b2 " + (b1 == b2));

        System.out.println(b1.equals(b3));
        System.out.println("b1 == b2 " + (b1 == b3));
    }
}

class Book implements Cloneable {
    int id;

    Book(int id) {
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
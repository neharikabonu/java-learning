import java.io.FileNotFoundException;
import java.io.FileReader;

public class C18 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    public static void readFile() throws FileNotFoundException {
        FileReader file = new FileReader("C1.java");
    }
}

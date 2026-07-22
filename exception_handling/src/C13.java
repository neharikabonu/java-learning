import java.io.FileNotFoundException;
import java.io.FileReader;

public class C13 {
    public static void main(String[] args) {
        try {
            readData();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readData() throws FileNotFoundException {
        FileReader file = new FileReader("abc.txt");
    }
}

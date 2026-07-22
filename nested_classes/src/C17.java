public class C17 {
    public static void main(String[] args) {
        Greeting greet = new Greeting() {
            @Override
            public void hello() {
                System.out.println("Hello World");
            }
        };
        greet.hello();
    }
}

interface Greeting {
    void hello();
}
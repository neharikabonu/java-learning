public class C6 {
    public static void main(String[] args) {
        System.out.println("Bank Locker System");
        Locker26 l1 = new Locker26();
        l1.setPassword("abc@gmail.com");
        System.out.println(l1.verifyPassword("abc@gmail.com"));
        System.out.println(l1.verifyPassword("xyz@password.com"));
    }
}

class Locker26 {
    private String pwd;

    public void setPassword(String pwd){
        if (pwd.length()>=8) {
            this.pwd = pwd;
        } else {
            System.out.println("Password length must be at least 8 characters.");
        }
    }

    public boolean verifyPassword(String pwd) {
        if (this.pwd.equals(pwd)) {
            return true;
        }
        return false;
    }
}
import java.util.Scanner;

public class C8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your gender");
    String input = sc.next().trim().toUpperCase();

    try {
      Gender gender = Gender.valueOf(input);
      greet(gender);
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid gender input");
    }
    sc.close();
  }

  public static void greet(Gender gender) {
    switch (gender) {
      case MALE -> System.out.println("Welcome MR.");
      case FEMALE -> System.out.println("Welcome MS.");
      case OTHER -> System.out.println("Welcome");
    }
  }
}

enum Gender {
  MALE,
  FEMALE,
  OTHER
}
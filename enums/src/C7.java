import java.util.Scanner;

public class C7 {
  public static void main(String[] args) {
//    Season season = Season.SUMMER;
//    printWeather(season);

    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("Enter season: ");
      String input = sc.next().trim().toUpperCase();

      try {
        Season season = Season.valueOf(input);
        printWeather(season);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println("Invalid Season");
      }

    }
  }

  public static void printWeather(Season season) {
    switch (season) {
      case SPRING -> System.out.println("Warm weather");
      case SUMMER -> System.out.println("Hot Weather");
      case AUTUMN -> System.out.println("Normal Weather");
      case WINTER -> System.out.println("Cool Weather");
    }
  }
}

enum Season {
  SPRING,
  SUMMER,
  AUTUMN,
  WINTER
}
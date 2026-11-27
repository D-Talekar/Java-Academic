import java.util.Scanner;

public class ClubPenguin {
  public static void main(String[] args) {
    // Write code below 💖
    Scanner scanner = new Scanner(System.in);
    double exchangeRate = 0.0045;
    System.out.print("Welcome to the Club Penguin money converter!");
    System.out.print("How many coins do you have? ");
    int coins = scanner.nextInt();
    double dollars = coins * exchangeRate;
    System.out.println("You have the following amount of dollars: ");
    System.out.println(dollars);
  }
}
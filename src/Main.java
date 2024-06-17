import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Poczatek programu");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = 12;
        System.out.println("Your number is: " + number);


        System.out.println("Koniec programu");
        System.out.println("Pocztaek klasy");
        Welcome welcome = new Welcome();
        System.out.println("What is your name ? ");
        String imie = sc.nextLine();
        welcome.przywiatnie(imie);
        System.out.println("Koniec klasy");
        sc.close();
    }
}
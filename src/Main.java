import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Poczatek programu");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        System.out.println("Your number is: " + number);

        sc.close();
        System.out.println("Koniec programu");
        System.out.println("Pocztaek klasy");
        Welcome welcome = new Welcome();
        welcome.przywiatnie("Kuba");
        System.out.println("Koniec klasy");
    }
}
package es.sanvalero.entornos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.print("Number to convert into roman numerals: ");
            int number = keyboard.nextInt();
            System.out.println(RomanNumerals.convert(number));
            System.out.print("Do you want to convert another number? (Y/N) ");
            String exitString = keyboard.nextLine();
            if (!exitString.equalsIgnoreCase("Y")) { exit = true; }
        } while (!exit);
    }
}
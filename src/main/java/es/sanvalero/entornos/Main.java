package es.sanvalero.entornos;
import java.util.Scanner;

/**
 * The Main class provides the entry point for the Roman numeral converter program.
 */

public class Main {
    private Main() {}
    public static void main(final String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Number (1 to 3000) to convert into roman numerals: ");
        int number = keyboard.nextInt();
        System.out.println(RomanNumerals.convert(number));
    }
}

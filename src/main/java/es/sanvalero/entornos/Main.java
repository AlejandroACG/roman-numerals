package es.sanvalero.entornos;
import java.util.Scanner;

/**
 * The Main class provides the entry point for the Roman numeral converter program.
 */

public final class Main {
    private Main() { }

    /**
     Main method that reads an integer number from user input and converts it to its Roman numeral equivalent
     using the RomanNumerals.convert() method.
     @param args an array of command-line arguments passed to the program
     */

    public static void main(final String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Number (from 1 to 3000) to" +
                "convert into roman numerals: ");
        int number = keyboard.nextInt();
        System.out.println(RomanNumerals.convert(number));
    }
}

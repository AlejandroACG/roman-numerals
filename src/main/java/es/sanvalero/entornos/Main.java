package es.sanvalero.entornos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Number (from 1 to 3000) to convert into roman numerals: ");
        int number = keyboard.nextInt();
        System.out.println(RomanNumerals.convert(number));
    }
}
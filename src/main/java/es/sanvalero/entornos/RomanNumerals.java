package es.sanvalero.entornos;

public class RomanNumerals {
    public static String convert (int number) {
        String romanNumeral = null;
        
        if (number == 1) {
            romanNumeral = "I";
        }
        if (number == 2) {
            romanNumeral = "II";
        }

        return romanNumeral;
    }
}
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
        if (number == 3) {
            romanNumeral = "III";
        }
        if (number == 4) {
            romanNumeral = "IV";
        }
        if (number == 5) {
            romanNumeral = "V";
        }
        if (number == 6) {
            romanNumeral = "VI";
        }
        if (number == 7) {
            romanNumeral = "VII";
        }

        return romanNumeral;
    }
}
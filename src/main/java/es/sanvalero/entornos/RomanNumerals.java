package es.sanvalero.entornos;

public class RomanNumerals {
    public static String convert (int number) {
        String romanOnes = null;
        String romanNumeral = null;

        if (number <= 10) {
            romanOnes = onesConversion(number);
            romanNumeral = romanOnes;
        }

        return romanNumeral;
    }

    private static String onesConversion(int ones) {
        String romanOnes;
        if (ones == 1) {
            romanOnes = "I";
        } else if (ones == 2) {
            romanOnes = "II";
        } else if (ones == 3) {
            romanOnes = "III";
        } else if (ones == 4) {
            romanOnes = "IV";
        } else if (ones == 5) {
            romanOnes = "V";
        } else if (ones == 6) {
            romanOnes = "VI";
        } else if (ones == 7) {
            romanOnes = "VII";
        } else if (ones == 8) {
            romanOnes = "VIII";
        } else {
            romanOnes = "IX";
        }
        return romanOnes;
    }
}
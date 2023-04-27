package es.sanvalero.entornos;

public class RomanNumerals {
    public static String convert (int number) {
        int[] arabicNumbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanNumerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder romanNumber = new StringBuilder();

        if (number <= 0 || number > 3000) {
            System.out.print("Invalid number.");
        } else {
            for (int i = 0; i < arabicNumbers.length; i++) {
                while (number >= arabicNumbers[i]) {
                    romanNumber.append(romanNumerals[i]);
                    number -= arabicNumbers[i];
                }
            }
        }
        return romanNumber.toString();
    }
}

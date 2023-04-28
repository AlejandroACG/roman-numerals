package es.sanvalero.entornos;

/**
 * The RomanNumerals class contains a static method that converts an integer number into a Roman numeral.
 */

public class RomanNumerals {
    public RomanNumerals() {}
    private static final int threeThousand = 3000;
    private static final int thousand = 1000;
    private static final int nineHundred = 900;
    private static final int fiveHundred = 500;
    private static final int fourHundred = 400;
    private static final int hundred = 100;
    private static final int ninety = 90;
    private static final int fifty = 50;
    private static final int fourty = 40;
    private static final int ten = 10;
    private static final int nine = 9;
    private static final int five = 5;
    private static final int four = 4;
    /**
     * Converts an integer number into a Roman numeral.
     *
     * @param number the integer number to be converted (from 1 to 3000)
     * @return the Roman numeral representation of the input number
     */

    public static String convert(int number) {
        int[] arabicNumbers = {thousand, nineHundred, fiveHundred, fourHundred, hundred, ninety, fifty, fourty,
                ten, nine, five, four, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"};
        StringBuilder romanNumber = new StringBuilder();

        if (number <= 0 || number > threeThousand) {
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

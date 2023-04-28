package es.sanvalero.entornos;

/**
 * The RomanNumerals class contains a static method that converts an integer number into a Roman numeral.
 */

public class RomanNumerals {
    public RomanNumerals() { }
    private static final int THREE_THOUSAND = 3000;
    private static final int THOUSAND = 1000;
    private static final int NINE_HUNDRED = 900;
    private static final int FIVE_HUNDRED = 500;
    private static final int FOUR_HUNDRED = 400;
    private static final int HUNDRED = 100;
    private static final int NINETY = 90;
    private static final int FIFTY = 50;
    private static final int FOURTY = 40;
    private static final int TEN = 10;
    private static final int NINE = 9;
    private static final int FIVE = 5;
    private static final int FOUR = 4;
    /**
     * Converts an integer number into a Roman numeral.
     *
     * @param number the integer number to be converted (from 1 to 3000)
     * @return the Roman numeral representation of the input number
     */

    public static String convert(int number) {
        int[] arabicNumbers = {THOUSAND, NINE_HUNDRED, FIVE_HUNDRED,
                FOUR_HUNDRED, HUNDRED, NINETY, FIFTY, FOURTY,
                TEN, NINE, FIVE, FOUR, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"};
        StringBuilder romanNumber = new StringBuilder();

        if (number <= 0 || number > THREE_THOUSAND) {
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

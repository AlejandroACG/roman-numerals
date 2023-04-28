package es.sanvalero.entornos;

/**
 * The RomanNumerals class contains a static method
 * that converts an integer number into a Roman numeral.
 */

public class RomanNumerals {
    private RomanNumerals() { }
    /**
     Returns a new instance of RomanNumerals class. This method is used
     so the constructor of RomanNumerals is kept private and only accessible
     through this method.
     @return a new instance of the RomanNumerals class.
     */
    public static RomanNumerals getInstance() {
        return new RomanNumerals();
    }
    /**
     Constante que define el valor máximo permitido para la conversión a números romanos.
     */
    private static final int THREE_THOUSAND = 3000;
    /**
     Constante que define el valor numérico de la letra romana "M" (1000).
     */
    private static final int THOUSAND = 1000;
    /**
     Constante que define el valor numérico de la letra romana "CM" (900).
     */
    private static final int NINE_HUNDRED = 900;
    /**
     Constante que define el valor numérico de la letra romana "D" (500).
     */
    private static final int FIVE_HUNDRED = 500;
    /**
     Constante que define el valor numérico de la letra romana "CD" (400).
     */
    private static final int FOUR_HUNDRED = 400;
    /**
     Constante que define el valor numérico de la letra romana "C" (100).
     */
    private static final int HUNDRED = 100;
    /**
     Constante que define el valor numérico de la letra romana "XC" (90).
     */
    private static final int NINETY = 90;
    /**
     Constante que define el valor numérico de la letra romana "L" (50).
     */
    private static final int FIFTY = 50;
    /**
     Constante que define el valor numérico de la letra romana "XL" (40).
     */
    private static final int FOURTY = 40;
    /**
     Constante que define el valor numérico de la letra romana "X" (10).
     */
    private static final int TEN = 10;
    /**
     Constante que define el valor numérico de la letra romana "IX" (9).
     */
    private static final int NINE = 9;
    /**
     Constante que define el valor numérico de la letra romana "V" (5).
     */
    private static final int FIVE = 5;
    /**
     Constante que define el valor numérico de la letra romana "IV" (4).
     */
    private static final int FOUR = 4;
    /**
     * Converts an integer number into a Roman numeral.
     *
     * @param input the integer number to be converted (from 1 to 3000)
     * @return the Roman numeral representation of the input number
     */

    public static String convert(final int input) {
        int number = input;
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

package es.sanvalero.entornos;

/**
 * The RomanNumerals class contains a static method that converts an integer number into a Roman
 * numeral.
 */
public final class RomanNumerals {
  private RomanNumerals() {}
  /**
   * Returns a new instance of RomanNumerals class. This method is used so the constructor of
   * RomanNumerals is kept private and only accessible through this method.
   *
   * @return a new instance of the RomanNumerals class.
   */
  public static RomanNumerals getInstance() {
    return new RomanNumerals();
  }
  /** Constant that defines the maximum value accepted.*/
  private static final int THREE_THOUSAND = 3000;
  /** Constant that defines the numeric value of roman letter "M" (1000).*/
  private static final int THOUSAND = 1000;
  /** Constant that defines the numeric value of roman letter "CM" (900).*/
  private static final int NINE_HUNDRED = 900;
  /** Constant that defines the numeric value of roman letter "D" (500).*/
  private static final int FIVE_HUNDRED = 500;
  /** Constant that defines the numeric value of roman letter "CD" (400).*/
  private static final int FOUR_HUNDRED = 400;
  /** Constant that defines the numeric value of roman letter "C" (100).*/
  private static final int HUNDRED = 100;
  /** Constant that defines the numeric value of roman letter "XC" (90).*/
  private static final int NINETY = 90;
  /** Constant that defines the numeric value of roman letter "L" (50).*/
  private static final int FIFTY = 50;
  /** Constant that defines the numeric value of roman letter "XL" (40).*/
  private static final int FOURTY = 40;
  /** Constant that defines the numeric value of roman letter "X" (10).*/
  private static final int TEN = 10;
  /** Constant that defines the numeric value of roman letter "IX" (9).*/
  private static final int NINE = 9;
  /** Constant that defines the numeric value of roman letter "V" (5).*/
  private static final int FIVE = 5;
  /** Constant that defines the numeric value of roman letter "IV" (4).*/
  private static final int FOUR = 4;
  /**
   * Converts an integer number into a Roman numeral.
   *
   * @param input the integer number to be converted (from 1 to 3000)
   * @return the Roman numeral representation of the input number
   */
  public static String convert(final int input) {
    int number = input;
    int[] arabicNumbers = {
      THOUSAND,
      NINE_HUNDRED,
      FIVE_HUNDRED,
      FOUR_HUNDRED,
      HUNDRED,
      NINETY,
      FIFTY,
      FOURTY,
      TEN,
      NINE,
      FIVE,
      FOUR,
      1
    };
    String[] romanNumerals = {
      "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };
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

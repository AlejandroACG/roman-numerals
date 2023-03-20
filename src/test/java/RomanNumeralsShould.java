import es.sanvalero.entornos.RomanNumerals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {
    @ParameterizedTest
    @CsvSource({"1, I", "2, II", "3, III", "4, IV", "5, V", "6, VI", "7, VII", "8, VIII", "9, IX"})
    void onesToRomanNumerals(int input, String expectedOutput) {
       assertEquals(expectedOutput, new RomanNumerals().convert(input));
    }
    @ParameterizedTest
    @CsvSource({"10, X", "11, XI", "20, XX", "30, XXX", "40, XL", "50, L", "60, LX", "70, LXX", "80, LXXX", "90, XC"})
    void tensToRomanNumerals(int input, String expectedOutput) {
        assertEquals(expectedOutput, new RomanNumerals().convert(input));
    }
    @ParameterizedTest
    @CsvSource({"100, C", "110, CX", "111, CXI", "200, CC", "300, CCC"})
    void hundredsToRomanNumerals(int input, String expectedOutput) {
        assertEquals(expectedOutput, new RomanNumerals().convert(input));
    }
}
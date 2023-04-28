import es.sanvalero.entornos.RomanNumerals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class RomanNumeralsShouldTest {
    @ParameterizedTest
    @CsvSource({"1, I", "2, II", "3, III", "4, IV", "5, V", "6, VI", "7, VII",
            "8, VIII", "9, IX"})
    void onesToRomanNumerals(final int input, final String expectedOutput) {
       assertEquals(expectedOutput, new RomanNumerals().convert(input));
    }
    @ParameterizedTest
    @CsvSource({"10, X", "11, XI", "20, XX", "30, XXX", "40, XL", "50, L",
            "60, LX", "70, LXX", "80, LXXX", "90, XC"})
    void tensToRomanNumerals(final int input, final String expectedOutput) {
        assertEquals(expectedOutput, new RomanNumerals().convert(input));
    }
    @ParameterizedTest
    @CsvSource({"100, C", "110, CX", "111, CXI", "200, CC", "300, CCC",
            "400, CD", "500, D", "600, DC", "700, DCC", "800, DCCC", "900, CM"})
    void hundredsToRomanNumerals(final int input, final String expectedOutput) {
        assertEquals(expectedOutput, new RomanNumerals().convert(input));
    }
    @ParameterizedTest
    @CsvSource({"1000, M", "1100, MC", "1110, MCX", "1111, MCXI", "2000, MM",
            "3000, MMM"})
    void thousandsToRomanNumerals(final int input, final String expectedOutput) {
        assertEquals(expectedOutput, new RomanNumerals().convert(input));
    }
}

import es.sanvalero.entornos.RomanNumerals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {
    @ParameterizedTest
    @CsvSource({"1, I", "2, II", "3, III", "4, IV", "5, V", "6, VI", "7, VII", "8, VIII"})
    void onesToRomanNumerals(int input, String expectedOutput) {
       assertEquals(expectedOutput, new RomanNumerals().convert(input));
    }
}
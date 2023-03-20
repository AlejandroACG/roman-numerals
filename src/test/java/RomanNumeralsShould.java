import es.sanvalero.entornos.RomanNumerals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {
    @Test
    void romanNumeralsConvert_1() {
        assertEquals("I", new RomanNumerals().convert(1));
    }
    @Test
    void romanNumeralsConvert_2() {
        assertEquals("II", new RomanNumerals().convert(2));
    }
}
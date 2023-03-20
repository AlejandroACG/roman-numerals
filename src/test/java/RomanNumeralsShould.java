import es.sanvalero.entornos.RomanNumerals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {
    @Test
    void romanNumeralsConvert() {
        assertEquals("I", new RomanNumerals().convert(1));
    }
}
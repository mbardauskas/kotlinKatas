import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import martynasb.kata.StringCalculator

class CalculatorTest {
    private val stringCalc = StringCalculator()

    @Test
    fun EmptyStringReturnsNull() {
        Assertions.assertEquals(null, stringCalc.add(""))
    }

    @Test
    fun SimpleStringReturnsInteger() {
        Assertions.assertEquals(3, stringCalc.add("3"))
    }
}
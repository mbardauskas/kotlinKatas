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

    @Test
    fun CommaDelimitedNumbersReturnSum() {
        Assertions.assertEquals(10, stringCalc.add("3,7"))
    }

    @Test
    fun NewLineDelimitedNumbersReturnSum() {
        Assertions.assertEquals(15, stringCalc.add("5\n5\n5"))
    }

    @Test
    fun BothDelimitationsReturnSumFromOneString() {
        Assertions.assertEquals(15, stringCalc.add("5\n5,5"))
    }

    @Test
    fun NegativeNumbersThrowException() {
        Assertions.assertThrows(IllegalArgumentException::class.java) { stringCalc.add("-1,5") }
    }
}
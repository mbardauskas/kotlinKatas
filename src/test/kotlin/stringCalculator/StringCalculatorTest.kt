package stringCalculator

//import java.lang.Exception
import org.junit.Assert
import org.junit.Test

class CalculatorTest {
    private val stringCalc = StringCalculator()

    @Test
    fun EmptyStringReturnsNull() {
        Assert.assertEquals(null, stringCalc.add(""))
    }

    @Test
    fun SimpleStringReturnsInteger() {
        Assert.assertEquals(3, stringCalc.add("3"))
    }

    @Test
    fun CommaDelimitedNumbersReturnSum() {
        Assert.assertEquals(10, stringCalc.add("3,7"))
    }

    @Test
    fun NewLineDelimitedNumbersReturnSum() {
        Assert.assertEquals(15, stringCalc.add("5\n5\n5"))
    }

    @Test
    fun BothDelimitationsReturnSumFromOneString() {
        Assert.assertEquals(15, stringCalc.add("5\n5,5"))
    }

//    @Test(expected = javaClass<IllegalArgumentException>)
//    fun NegativeNumbersThrowException() {
//        javaClass<IllegalArgumentException>
//        val exception: Exception = Assert.assert(IllegalArgumentException::class.java) { stringCalc.add("-1,5,-3") }
//        Assert.assertEquals("Negatives not allowed: -1, -3", exception.message)
//    }

    @Test
    fun NumbersGreaterThan1000AreIgnored() {
        Assert.assertEquals(15, stringCalc.add("5\n5,5,1001"))
    }
}
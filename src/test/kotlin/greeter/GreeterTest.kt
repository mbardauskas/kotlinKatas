package greeter

import org.junit.Assert
import org.junit.Before
import org.junit.Test


class GreeterTest {
    private lateinit var uut: Greeter
    private val regularTimeGetter: () -> Int = { 14 }

    @Before
    fun beforeEach() {
        uut = Greeter(regularTimeGetter)
    }

    @Test
    fun ReturnsHelloName() {
        Assert.assertEquals("Hello Bob", uut.greet("Bob"))
    }

    @Test
    fun TrimsTheInput() {
        Assert.assertEquals("Hello Bob", uut.greet("   Bob    "))
    }

    @Test
    fun CapitalizesFirstLetter() {
        Assert.assertEquals("Hello Tom", uut.greet("tom"))
    }

    @Test
    fun ReturnsGoodMorningWhenTimeIsBetween6and12() {
        val morningTimeGetter: () -> Int = { 6 }
        uut = Greeter(morningTimeGetter)
        Assert.assertEquals("Good morning Tom", uut.greet("tom"))
    }

    @Test
    fun ReturnsGoodEveningWhenTimeIsBetween18and22() {
        val eveningTimeGetter: () -> Int = { 18 }
        uut = Greeter(eveningTimeGetter)
        Assert.assertEquals("Good evening Tom", uut.greet("tom"))
    }

    @Test
    fun ReturnsGoodNightWhenTimeIsBetween22and6() {
        val nightTimeGetter: () -> Int = { 22 }
        uut = Greeter(nightTimeGetter)
        Assert.assertEquals("Good night Tom", uut.greet("tom"))
    }

    @Test
    fun LogsIntoConsoleWithEachCall() {
        // @TODO:
    }
}
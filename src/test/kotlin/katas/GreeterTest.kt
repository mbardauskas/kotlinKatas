package martynasb.katas

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class GreeterTest {
    private lateinit var uut: Greeter
    private val regularTimeGetter: () -> Int = { 14 }

    @BeforeEach
    fun beforeEach() {

        uut = Greeter(regularTimeGetter)
    }

    @Test
    fun ReturnsHelloName() {
        Assertions.assertEquals("Hello Bob", uut.greet("Bob"))
    }

    @Test
    fun TrimsTheInput() {
        Assertions.assertEquals("Hello Bob", uut.greet("   Bob    "))
    }

    @Test
    fun CapitalizesFirstLetter() {
        Assertions.assertEquals("Hello Tom", uut.greet("tom"))
    }

    @Test
    fun ReturnsGoodMorningWhenTimeIsBetween6and12() {
        val morningTimeGetter: () -> Int = { 6 }
        uut = Greeter(morningTimeGetter)
        Assertions.assertEquals("Good morning Tom", uut.greet("tom"))
    }

    @Test
    fun ReturnsGoodEveningWhenTimeIsBetween18and22() {
        val eveningTimeGetter: () -> Int = { 18 }
        uut = Greeter(eveningTimeGetter)
        Assertions.assertEquals("Good evening Tom", uut.greet("tom"))
    }

    @Test
    fun ReturnsGoodNightWhenTimeIsBetween22and6() {
        val nightTimeGetter: () -> Int = { 22 }
        uut = Greeter(nightTimeGetter)
        Assertions.assertEquals("Good night Tom", uut.greet("tom"))
    }

    @Test
    fun LogsIntoConsoleWithEachCall() {
        // @TODO:
    }
}
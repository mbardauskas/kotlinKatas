package martynasb.kata
import java.util.*

class StringCalculator {
    fun add(sum: kotlin.String): kotlin.Int? {
        if (sum.isEmpty()) return null

        return sum.toInt()
    }
}
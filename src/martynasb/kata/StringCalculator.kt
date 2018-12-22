package martynasb.kata

class StringCalculator {
    fun add(input: String): Int? {
        if (input.isEmpty()) return null

        val arrayOfNumbers: List<Int> = this.assertNoNegatives(
                this.parseInput(input)
        )

        return arrayOfNumbers.reduce { acc, element -> acc + element }
    }

    private fun assertNoNegatives(numbers: List<Int>): List<Int> {
        val negatives = numbers.filter { it < 0 }
        if (negatives.isEmpty()) {
            return numbers
        }
        throw IllegalArgumentException("Negatives not allowed: " + negatives.joinToString { it.toString() })
    }

    private fun parseInput(input: String): List<Int> {
        return input.split(",", "\n").map { it.toInt() }
    }
}
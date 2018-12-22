package martynasb.kata

class StringCalculator {
    fun add(sum: String): Int? {
        if (sum.isEmpty()) return null

        val arrayOfNumbers:List<Int> = sum.split(",", "\n").map {
            val num:Int = it.toInt()
            if (num < 0) throw IllegalArgumentException("Negatives not allowed:")
            num
        }

        return arrayOfNumbers.reduce{ acc, element -> acc + element }
    }
}
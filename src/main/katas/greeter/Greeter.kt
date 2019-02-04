package katas.greeter

class Greeter(
        private val getTimeInHours: () -> Int
) {
    private fun getCleanName(name: String): String {
        return name.trim().capitalize()
    }

    private fun getGreeting(): String {
        val time: Int = getTimeInHours()
        if (time in 6..11) {
            return "Good morning"
        }
        if (time in 18..21) {
            return "Good evening"
        }
        if (time >= 22 || time < 6) {
            return "Good night"
        }
        return "Hello"
    }

    fun greet(name: String): String {
        return "${getGreeting()} ${getCleanName(name)}"
    }
}

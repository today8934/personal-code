import java.util.Arrays

class KotlinMain {
    fun joinToStringTest() {
        val options: Collection<String> = listOf("1", "2", "3")

        println(options.joinToString(separator = ", ", prefix = "[", postfix = "]"))
    }
}


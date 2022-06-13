class KotlinMain {
    fun joinToStringTest() {
        val options: Collection<String> = listOf("1", "2", "3")

        println(options.joinToString(separator = ", ", prefix = "[", postfix = "]"))
    }

    /*
    Overload Test
     */
    fun defaultArgumentsTest() {
        println(foo("a"))
        println(foo("b", number = 1))
        println(foo("c", toUpperCase = true))
        println(foo(name = "d", number = 2, toUpperCase = true))
    }

    fun foo(name: String = "", number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.uppercase() else name) + number
}


package classes

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */
enum class Priority(val value: Int) {
    MINOR(-1) {
        override fun text(): String {
            return "Minor Priority"
        }

        override fun toString(): String {
            return text()
        }
    },
    NORMAL(0) {
        override fun text(): String {
            return "Normal Priority"
        }
    },
    MAJOR(1) {
        override fun text(): String {
            return "Major Priority"
        }
    },
    CRITICAL(11) {
        override fun text(): String {
            return "Critical Priority"
        }
    };

    abstract fun text(): String
}

fun main(args: Array<String>) {
    val priority = Priority.NORMAL
    println(priority.toString())
    println(priority.value)
    println(Priority.CRITICAL.ordinal)

    for (p in Priority.values()) {
        println(p)
    }

}
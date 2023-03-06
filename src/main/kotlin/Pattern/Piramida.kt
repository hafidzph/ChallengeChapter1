package Pattern

import Abstract.Display

class Piramida(private val size: Int = 8, private val base: BasePattern = BasePattern()): Display {
    override fun getDisplay() {
        println("Pola Piramida Bintang")
        for (i in 1..size) {
            base.printUtility(1, size - i, " ", false)
            base.printUtility(1, 2 * i - 1, "*", false)
            println()
        }
    }
}
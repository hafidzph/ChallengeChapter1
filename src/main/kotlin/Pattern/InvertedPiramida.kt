package Pattern

import Abstract.Display

class InvertedPiramida(private val size: Int = 8, private val base: BasePattern = BasePattern()): Display {
    override fun getDisplay() {
        println("Pola Piramida Terbalik Bintang")
        for (i in size downTo 1) {
            base.printUtility(1, size - i, " ", false)
            base.printUtility(1, 2 * i - 1, "*", false)
            println()
        }
    }
}
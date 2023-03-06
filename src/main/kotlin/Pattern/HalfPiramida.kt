package Pattern

import Abstract.Display

class HalfPiramida(private val size: Int = 8, private val base: BasePattern = BasePattern()): Display {
    override fun getDisplay() {
        println("Pola Segitiga Siku-Siku Bintang")
        for (i in 1..size) {
            base.printUtility(1, i, "*", false)
            println()
        }
    }
}
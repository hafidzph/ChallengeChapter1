package Pattern

import Abstract.Display

class BelahKetupat(private val size: Int = 8, private val base: BasePattern = BasePattern()): Display {
    override fun getDisplay() {
        println("Pola Belah Ketupat Bintang")
        for (i in 1..size) {
            base.printUtility(i, size, " ", true)
            base.printUtility(1, 2*i, "*", true)
            println()
        }
        for (i in size - 1 downTo 1) {
            base.printUtility(i, size, " ", true)
            base.printUtility(1, 2*i, "*", true)
            println()
        }
    }
}
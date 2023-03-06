package Pattern

import Abstract.Display

class Plus(private val size: Int = 11, private val base: BasePattern = BasePattern()): Display {
    override fun getDisplay() {
        println("Pola Plus Bintang")
        for (i in 0 until size) {
            if (i == size / 2) {
                base.printUtility(1, size, "* ", false)
            } else {
                base.printUtility(0, size-2, " ", false)
                print("* ")
            }
            println()
        }
    }
}
package Pattern

import Abstract.Display

class X(private val size: Int = 16, private val base: BasePattern = BasePattern()): Display {
    override fun getDisplay() {
        println("Pola X Bintang")
        for(i in 0 until size){
            for(j in 0 until size+1){
                if(i == j || i + j == size) base.printUtility(1, 1, "*", false)
                else base.printUtility(1, 1, " ", false)
            }
            println()
        }
    }
}
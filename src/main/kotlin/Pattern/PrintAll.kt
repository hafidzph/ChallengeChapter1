package Pattern

import Abstract.Display

class PrintAll {
    fun printAll(pattern: Array<Display>) {
        for(i in pattern){
            i.getDisplay()
            println()
        }
    }
}
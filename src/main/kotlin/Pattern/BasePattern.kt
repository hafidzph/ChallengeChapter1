package Pattern

import Abstract.PatternUtility

class BasePattern: PatternUtility() {
    override fun printUtility(firstIndex: Int, lastIndex: Int, string: String, useUntil: Boolean) {
        val uses = if(useUntil) firstIndex until lastIndex else firstIndex..lastIndex
        for (i in uses) print(string)
    }
}

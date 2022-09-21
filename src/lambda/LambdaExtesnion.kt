package lambda

import javax.swing.text.View

fun main() {
    Test().takeLambda(5, 6) { a: Int, b: Int ->
        a + b
    }
    Test().takeLambda(5, 6, { a, b -> a + b })
    Test().takeLambda(5, 6) { a, b -> a + b }
    Test().takeLambda(5, 6, { a: Int, b: Int -> a + b })
    val p: (Int, Int) -> Int = { a, b -> a + b }
    Test().takeLambda(5,6, p)

    val l : (Int)->Int = {a-> a*a}

    val res = l(5)
    println(res)

    //// val/var: type(input types for args)-> return type = body/expression





}

class Test {

    fun takeLambda(s: Int, t: Int, lambda: (a: Int, b: Int) -> Int) {
        val sum = lambda(s, t)
        println(sum)
    }

}

fun String.compareLength(otherLength: Int): Boolean {
    return this.length > otherLength
}


interface MyCLListener {
    fun ViewClicked(view: View)
}

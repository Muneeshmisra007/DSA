import javax.swing.text.View

class LambdaTest {


    fun takeMyLambda(l: (a: Int, b: Int) -> Int) {

        val sum = l(4, 5)
        println(sum)
    }

    fun returnMyLambda(): (a: Int, b: Int) -> Int {

        return ::sum
    }
}

fun main() {

    useOfFoldReduce()


}

interface SAM {
    fun onClick(v: View) {

    }
}

fun sum(a: Int, b: Int): Int {

    return a + b;
}

infix fun Int.add(b: Int): Int {
    return this + b
}


fun NothingTest(){
        val map = emptyMap<String, String>()
   val text = if(map.containsKey("dss")) map.get("dss") else throw java.lang.Exception()
    println(text)
//    throw java.lang.Exception()
}


//sngle expression funtion can ommit return type
fun multi(a: Int, b:Int) = a+b
fun multi2(a: Int, b:Int): Int = a+b

fun <T> asList(vararg ts: T): ArrayList<T> {
    val list = ArrayList<T>()
    for (ob in ts) {
        list.add(ob)
    }
    return list
}



private fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

private fun useOfFoldReduce(){
    val list = listOf<String>("mun", "kumar", "misra")

    val fold = list.fold("name info: "){ type, value-> " $type $value" }
    val reduce = list.reduce(){ value1, value2-> " $value1 $value2" }
    println("fold $fold")
    println("reduce $reduce")
}



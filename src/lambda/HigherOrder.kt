package lambda

fun main() {
   val res = passMeFun(::add)
       println(res)

}

fun add(a: Int, b:Int):Int{
    return a+b
}


fun passMeFun(fn : ((Int, Int)->Int)): Int{
   return fn(5,4)
}
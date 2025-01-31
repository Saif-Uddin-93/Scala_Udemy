package lectures.part1basics

import scala.annotation.tailrec

object Functions extends App {
    def aFunction(a: String, b: Int): String = {
        a + " " + b
    }

    println(aFunction("age:", 32))

    def fib(x: Int, acc: Int = 1, last: Int = 0): Int = {
        if (x == 0) last
        else fib(x-1, acc + last, acc)
    }

    println(fib(8)) // 21
    // index: 0, 1,2,3,4,5,6,7, 8
    // fib: 0, 1, 1 
    //(0,1,1,2,3,5,8,13,21,...)


}

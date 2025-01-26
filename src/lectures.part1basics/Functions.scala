package lectures.part1basics

object Functions extends App {
    def aFunction(a: String, b: Int): String = {
        a + " " + b
    }

    println(aFunction("age:", 32))

    // recursive functions need their return types defined
    def fib(f: Int): Int = {
        if (f<=0) 0 
        else if (f==1) 1
        else fib(f-1) + fib(f-2)
    }
    println(fib(5))
}

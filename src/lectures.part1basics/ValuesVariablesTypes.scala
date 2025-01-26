package lectures.part1basics

object ValuesVariablesTypes extends App {
    // vals are immutable
    // vals types can be inferred or specified explicitly
    val x: Int = 42;
    val y: String = "Scala basics";
    val z: Boolean = true
    val a: Char = 'a'
    val b: Float = 3.14f;
    val c: Double = 2.0;
    println(x);

    // vars are mutable
    var aVar: Int = 32;
    aVar = 23;
    // reassigning vars are known as side effects
}

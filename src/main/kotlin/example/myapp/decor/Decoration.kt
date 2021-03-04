package example.myapp.decor

data class Decoration(val rocks: String) {
}

data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

fun makeDecorations() {
//    val decoration1 = Decoration("granite")
//    println(decoration1)
//
//    val decoration2 = Decoration("slate")
//    println(decoration2)
//
//    val decoration3 = Decoration("slate")
//    println(decoration3)
//
//
//    println (decoration1 == decoration2)
//    println (decoration3 == decoration2)

    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)
    val (rock, wood, diver) = d5 //  val (rock, _, diver) = d5 -> If you dont need all the variabes
    println(rock)
    println(wood)
    println(diver)
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}
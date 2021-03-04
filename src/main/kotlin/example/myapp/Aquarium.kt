package example.myapp

open class Aquarium(open var length: Int = 100, open var height: Int = 40, open var width: Int = 20) {

    init {
        println("\n")
        println("aquarium initializing")
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1

        height = (tank / (length * width)).toInt()
    }

    open var volume: Int
        get() = length * width * height / 1000
        set(value) {
            height = ( value * 1000 ) / ( width * length)
        }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println(
            "Width: $width cm " +
            "Length: $length cm " +
            "Height: $height cm "
        )

        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
    }
}
package example.myapp


class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Shark : FishColor, FishAction {
    override val color: String = "Gray"
    override fun eat() {
        println("Shark eats fishes")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor) : FishColor by fishColor,
    FishAction by PrintingFishAction("Plecostomus eats algae") {
}
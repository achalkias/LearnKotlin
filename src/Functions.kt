fun main(args: Array<String>) {

    fun forceChoke() {
        println("You have failed me for the last time Admiral...")
    }

    forceChoke()

    fun makeAnEntrance(line: String) {
        println(line)
    }

    makeAnEntrance("I find your lack of faith disturbing.")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int {
       val goodGuys = rebels + ewoks
        return  goodGuys
    }

    val rebels = calculateNumberGoodGuys(5, 7)
    println("Darth Vader faced off against $rebels rabel scum")
    println("Darth Vader faced off against ${calculateNumberGoodGuys(5,7)} rabel scum")



    fun vaderIsFeeling(mood: String = "angry") {
        println(mood)
    }

    vaderIsFeeling()
    vaderIsFeeling("meh")

}
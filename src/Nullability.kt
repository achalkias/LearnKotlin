fun main(args: Array<String>) {


    var name: String = "Tolis"
    //name = null We cannot do this

    var nullableName: String? = "Do I really exists?"

    nullableName = null

    // Null check
    var length = 0
    if (nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)

    //Better way null check
    val l = if (nullableName != null) nullableName.length else -1
    println(l)

    // Second method Safe call Operator  ?
    println(nullableName?.length)

    //Elvis operator
    val len = nullableName?.length ?: -1
    println(len)
    val noName = nullableName ?: "No one knows me..."
    println(noName)

    // !! Get a null pointer exception and crash code
//    println(nullableName!!.length)
}
fun main(args: Array<String>) {

    val str = "May the force be with you."
    println(str)

    val str1 = "My dad said the funniest thing he said \n \"A joke\""
    println(str1)


    val rawCrawl = """|A long time ago,
        |in a galaxy
        |far, far away...
        |BUMM BUMM BUMMMM""".trimMargin()
    println(rawCrawl)

//    for (char in str) {
//        println(char)
//    }

    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)

    val contains = str.contains("force", true)
    println(contains)

    val upperCase = str.toUpperCase()
    val lower = str.toLowerCase()
    println(upperCase)
    println(lower)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subSequence = str.subSequence(4, 13)
    println(subSequence)

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27

    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and is $age years old")
    println("Lukes full name $luke has ${luke.length} characters")
}
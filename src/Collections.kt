fun main(args: Array<String>) {

    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperials)
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.first())
    println(imperials.last())
    print(imperials.contains("Emperor"))

    val rebels = arrayListOf("Leiah","Luke","Han Solo","Mon Mothma")
    print(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0,"Lando")
    println(rebels.indexOf("Luke"))
    rebels.remove("Han Solo")
    println(rebels)


    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon","Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah","This ship doesn't exists"))
    println(rebelVehiclesMap.keys)
    println(rebelVehiclesMap.values)

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon","Luke" to "Landspeeder","Boba Fett" to "Rocket pack")
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah","Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    rebelVehicles.clear()
    println(rebelVehicles)
    print(rebelVehicles.isEmpty())



}
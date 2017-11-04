fun main(args: Array<String>) {
    val printMessage = { message: String -> println(message) }

    printMessage("Hello World")

    val sumA = { x: Int, y: Int -> x + y }
    println(sumA(5, 3))
    val sumB: (Int, Int) -> Int = { x, y -> x + y }
    println(sumB(10, 493))


    fun downloadData(url: String, completion: () -> Unit) {
        //sent a download request
        //we got back data
        //there where no network errors
        completion()
    }

    downloadData("fakeUrl.com") {
        println("The code in this block will only run after the completion()")
    }



    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        //send download request
        // we got back car data
        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)
    }

    downloadCarData("fakeUrl.com") { car ->
        println(car.color)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        ///Make web request
        val webRequestSucces = true
        if (webRequestSucces) {
            val truck = Truck("Ford", "f-150", "99430")
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeurl.com") { truck, success ->
        if (success == true){
            truck?.tow()
        } else{
            println("Something went wrong")
        }
    }

}
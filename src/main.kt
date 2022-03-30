fun main(){
    var car=Car("Subaru","MPG","Black",8)
    car.carry(12)
    car.identity("white","Subaru","legacy")
    println(car.calculateParkingFees(5))

    var bus=Bus("Toyota","Coaster","Black",13)
    bus.carry(15)
    bus.identity("white","subaru","mpg")
    println(bus.maxTripFare(90.5))
    println(bus.calculateParkingFees(3))


}
 open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
     fun carry(people: Int) {

         if (people <= capacity) {

             println("carrying $people passengers")
         } else {
             var y = people - capacity
             println("Over capacity by $y people")
         }
     }
         fun identity(color: String,make: String,model: String) {
             println("I am $color $make $model")
         }

     open fun calculateParkingFees(hours: Int):Int {
             var h = hours * 20
             println(h)
             return h
         }



 }


class Bus( make:String, model:String, color:String, capacity:Int):Car(make,model,color,capacity){


    fun maxTripFare(fare:Double):Double{
    var maxfare =fare*capacity
        return maxfare
    }

    override fun calculateParkingFees(hours: Int):Int{
        var p =hours* capacity
        return p
    }
}
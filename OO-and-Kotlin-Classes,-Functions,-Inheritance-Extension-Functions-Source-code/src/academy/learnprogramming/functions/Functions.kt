package academy.learnprogramming.functions



fun main(args: Array<String>) {
    println(labelMultiply(label = "Here's the result:", operand2 = 3, operand1 = 4))

    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())

    val car1 = Car("blue", "Toyota", 2015)
    val car2 = Car("red", "Ford", 2016)
    val car3 = Car("grey", "Ford", 2017)

    printColors(car1, car2, car3)

    val numbers = arrayOf(1, 2, 3)

    val manyCars = arrayOf(car1, car2, car3)
    printColors(*manyCars)

    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)
    for (c in lotsOfCars) {
        println(c)
    }

    val s = "this is all in lowercase"
    println(s.upperFirstAndLast())


}

fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}

fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

fun whatever() = 3 * 4

fun labelMultiply(operand1: Int, operand2: Int,
                  label: String = "The answer is:") =
    "$label ${operand1 * operand2}"

class Employee(val firstName: String) {

    fun upperCaseFirstName() = firstName.toUpperCase()

}

data class Car(val color: String, val model: String, val year: Int) {

}




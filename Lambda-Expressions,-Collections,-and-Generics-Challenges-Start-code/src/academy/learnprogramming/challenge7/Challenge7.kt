package academy.learnprogramming.challenge7

fun main(args: Array<String>) {

    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)


}


class Person(val firstName: String, val lastName: String, val age: Int) {


}


class Box<T> {


}

open class Paper {

}

class Regular: Paper() {

}

class Premium: Paper() {

}
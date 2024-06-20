package academy.learnprogramming.anotherpackage

import academy.learnprogramming.communications.CompanyCommunications as Comm
import academy.learnprogramming.communications.topLevel as tp
import academy.learnprogramming.communications.Department.*
import academy.learnprogramming.communications.upperFirstAndLast as ufal


fun main(args: Array<String>) {
    tp("Hello from AnotherFile")
    println(Comm.getCopyrightLine())
    println(IT.getDeptInfo())
    println(SALES.getDeptInfo())
    println("some string".ufal())

}
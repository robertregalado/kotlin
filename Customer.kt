/*
All programs need to be able to store data, and variables help you to do just that. In Kotlin, you can declare:

read-only variables with val

mutable variables with var

To assign a value, use the assignment operator =.
*/

fun main() { 
    val popcorn = 5    // There are 5 boxes of popcorn
    val hotdog = 7     // There are 7 hotdogs
    var customers = 10 // There are 10 customers in the queue

    // Some customers leave the queue
    customers = 8
    println(customers)
    println(hotdog)
    println(popcorn)
    // 8
}
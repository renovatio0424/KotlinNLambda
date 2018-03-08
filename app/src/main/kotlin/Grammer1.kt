/**
 * Created by renov on 2018-03-08.
 */
package com.example.renov.bindingdata


/**
 * In this example, `val` denotes a declaration of a read-only local variable,
 * that is assigned an pattern matching expression.
 * See http://kotlinlang.org/docs/reference/control-flow.html#when-expression
 */

fun main(args: Array<String>) {
    //     fun
    fun sum(a: Int, b:Int) = a + b
    fun max(a:Int, b:Int) = if (a>b) a else b
    val example = "example] "

    fun printExample (section: String) = println("\n" + example + section)

    printExample("function")
    println(sum(3,2))
    println(max(10,5))

//     null

    printExample("null")
    var b: Int? = null
    println(b)

//     any
    printExample("any")
    fun getStringLength(obj: Any): Int? {
        if(obj is String){
            return obj.length
        }

        return null
    }

    println(getStringLength(5))


//     when
    printExample("when")
    cases("Hello") // String
    cases(1) // Int
    cases(System.currentTimeMillis()) // Long
    cases(MyClass()) // Not a string
    cases("hello") // Unknown

//     loop
    printExample("loop")
    for (x in 1..5){
        println(x)
    }
//     range

    //Iterate over a range:
    for (a in 1..5)
        print("${a} ")

    //Check if a number is out of range:
    println()
    val array = arrayListOf<String>()
    array.add("aaa")
    array.add("bbb")
    array.add("ccc")


    //Check if a collection contains an object:
    if ("aaa" in array) // collection.contains(obj) is called
        println("Yes: array contains aaa")

    if ("ddd" in array) // collection.contains(obj) is called
        println("Yes: array contains ddd")
    else
        println("No: array doesn't contains ddd")
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

class MyClass() {
}


/**
 *
example] function
5
10

example] null
null

example] any
null

example] when
Greeting
One
Long
Not a string
Unknown

example] loop
1
2
3
4
5
1 2 3 4 5
Yes: array contains aaa
No: array doesn't contains ddd

http://thdev.tech/kotlin/2016/08/02/Basic-Kotlin-01.html
 */
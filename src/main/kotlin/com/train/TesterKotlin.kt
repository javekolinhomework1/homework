package com.train

import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    println("Please enter number of tickets:")
    var numberticket = scan.nextInt()
    println("Please enter number of tickets:")
    var roundtriptickets = scan.nextInt()

    val t = Tester2(numberticket, roundtriptickets)
    t.print()


}

class Tester2(var numberticket:Int, var roundtriptickets:Int){
    var onewayprice = 1000;
    var rountripdis = 0.9f;
    var roundtripprice = 2000*rountripdis;
    fun print(){
        println("Total tickets: $numberticket \tRound-trip: $roundtriptickets \tTotal: ${getPrice()}")
    }

    fun getPrice(): Float{
        return ((numberticket-roundtriptickets)*onewayprice + roundtriptickets*roundtripprice);
    }
}
package ru.netology

fun main() {
    var songPrice = 100;
    var countSong = 11;
    var amount = songPrice * countSong;
    val customer: Boolean = true;

    if (amount <= 1000) {
        if (customer == true) {
            amount = amount - (amount / 100)
            println("С вас $amount");
        } else {
            println("С вас $amount");
        }
    } else if (amount > 1000 && amount <= 10000) {
        amount = amount - 100;
        if (customer == true) {
            amount = amount - (amount / 100)
            println("С вас $amount");
        } else {
            println("С вас $amount");
        }
    } else if (amount > 10000) {
        amount = amount - (amount / 20);
        if (customer == true) {
            amount = amount - (amount / 100)
            println("С вас $amount");
        } else {
            println("С вас $amount");
        }
    }
    /*var price = 100
    var song = 11
    var amount = price * song
    var custom: Boolean = true;

    if (amount)

     */
}
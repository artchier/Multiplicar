package br.digital.com

fun main(){

    val array = arrayListOf<Int>()
    //em array.add (Int, Int), o primeiro Int é sempre a posição do array
    // e o segundo é sempre o que vai ser adicionado!!
    array.add (0, 1)
    array.add (1, 4)
    array.add (2, 7)

    Multiplicar(array).multiplicar()
}
package br.digital.com

class Multiplicar(var lista: ArrayList<Int>) {

    fun multiplicar() {
        var resultado = 1
        //until dentro do for vai até a "posição final -1"!!
        for (num in 0 until lista.size)
            resultado *= lista[num]

        println("O Array $lista com seus elementos multiplicados entre si tem resultado de $resultado")
    }
}
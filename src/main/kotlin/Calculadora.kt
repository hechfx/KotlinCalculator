package src.main.kotlin

class Calculadora(val x: Long){
    fun adicionar(y: Long): Long = x + y
    fun multiplicar(y: Long): Long = x * y
    fun subtrair(y: Long): Long = x - y
    fun dividir(y: Long): Long = x / y
}